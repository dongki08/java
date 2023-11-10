package com.green.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;



    class MyconnTest {
        public static void main(String[] args) {

            BoardEntity board = new BoardEntity();
            board.setTitle("오늘");
            board.setCtnts("목요일");
            board.setWriter("내일 금요일");

            BoardDao.insBoard(board);
            //title : 처음 작성
            //ctnts : 처음 작성하는 내용입니다.
            //wirter : 홍길동
        }
    }

    class MyConnTest3 {
        public static void main(String[] args) {
            BoardEntity entity = new BoardEntity();
            entity.setIboard(4);

            int row = BoardDao.delBoard(entity);
        }
    }

    class MyConnTest4 {
        public static void main(String[] args) {
            BoardEntity entity = new BoardEntity();
            entity.setIboard(3);
            entity.setTitle("수정 제목");
            entity.setCtnts("수정 내용");
            entity.setWriter("수정자");

            int row = BoardDao.updBoard(entity);
            System.out.println("row : " + row);
        }
    }

    class MyConnTest5 {
        public static void main(String[] args) {
            List<BoardEntity> list = BoardDao.selBoardList();
            for (BoardEntity entity : list) {

                System.out.println(entity);
                //iboard : 값, title : 값, ctnts : 값, writer : 값, createdAt : 값
            }
        }
    }

class MyConnTest6 {
    public static void main(String[] args) {
        BoardEntity result = BoardDao.selBoardById(3);
        System.out.println(result);
    }
}
