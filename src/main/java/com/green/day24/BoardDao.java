package com.green.day24;

import org.checkerframework.checker.units.qual.A;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//data access object
public class BoardDao {
    public static int insBoard(BoardEntity entity) {
        int result = 0;
        //String sql = "insert into board (title, ctnts, writer)" +
                    // "values (?, ?, ?)";
        String sql = "insert into board " +
                     " set title = ?, ctnts = ?, writer = ?";
        //vo : value object
        //dto : data transfer object
        //entity : entity
        Connection con = null;
        PreparedStatement ps = null; //물음표에 값을 넣는 기능이 있다
        try {
            con = MyConn.getConn();
            ps = con.prepareStatement(sql);
            ps.setString(1, entity.getTitle());
            ps.setString(2, entity.getCtnts());
            ps.setString(3, entity.getWriter());

            result = ps.executeUpdate(); //영향 받은 레코드수가 넘어온다 (정수형)

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(con, ps);
        }
        return result;
    }


    public static int delBoard(BoardEntity del) {
        int result = 0;
        Connection con = null;
        PreparedStatement ps = null;
        String sql = "delete from board where iboard = ?";
        try {
            con = MyConn.getConn();
            ps = con.prepareStatement(sql);
            ps.setInt(1, del.getIboard());
            result = ps.executeUpdate();
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            MyConn.close(con, ps);
        }
        return result;
    }
    //iboard 전체 값 가져오기
    // selBoardList !()! 전부 다 가져오겠다
    //검색, 페이징 파라메터 사용 여러개 가져올때
    public static List<BoardEntity> selBoardList() {
        List<BoardEntity> list = new ArrayList(); // List<보드엔터티 타입만 들어올수있다> 하나의 언어
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select iboard, title, writer, created_at " +
                "from board";
        try {
            con = MyConn.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while(rs.next()) {
                int iboard = rs.getInt("iboard");
                String title = rs.getString("title");
                String writer = rs.getString("writer");
                String createdAt = rs.getString("created_at");

                BoardEntity board = new BoardEntity();

                board.setIboard(iboard);
                board.setTitle(title);
                board.setWriter(writer);
                board.setCreatedAt(createdAt);

                list.add(board);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            MyConn.close(con, ps, rs);
        }
        return list;
    }

    //sql 수정코드
    public static int updBoard(BoardEntity up) {
        int result = 0;
        String sql = "update board set title = ?, ctnts = ?, writer = ?" +
                ", updated_at = now() where iboard = ?";
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = MyConn.getConn();
            ps = con.prepareStatement(sql);
            ps.setString(1, up.getTitle());
            ps.setString(2, up.getCtnts());
            ps.setString(3, up.getWriter());
            ps.setInt(4, up.getIboard());
            result = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            MyConn.close(con, ps);
        }
        return result;
    }

    //pk 3번값만 가져오기
    public static BoardEntity selBoardById(int iboard) {
        int result = 0;
        String sql = "select iboard, title, ctnts, writer, " +
                "created_at, updated_at from board where iboard = ?"; //where 절에 pk 경우의 수 0, 1
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = MyConn.getConn();
            ps = con.prepareStatement(sql);
            ps.setInt(1, iboard);
            rs = ps.executeQuery();

            // rs.next : 첫번째 레코드 선택 있으면 true 없으면 false
            // 한번 더 호출 다음줄 선택 if문 안에는 boolean타입
            if(rs.next()) {
                BoardEntity entity = new BoardEntity();
                entity.setIboard(iboard);
                entity.setTitle(rs.getString("title"));
                entity.setCtnts(rs.getString("ctnts"));
                entity.setWriter(rs.getString("writer"));
                entity.setCreatedAt(rs.getString("created_at"));
                entity.setUpdatedAt(rs.getString("updated_at"));
                return entity;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            MyConn.close(con, ps, rs);
        }
        return null;
    }
}

