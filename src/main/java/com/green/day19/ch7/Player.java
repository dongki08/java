package com.green.day19.ch7;

class PlayerTest {
    public static void main(String[] args) {
        AudioPlayer ap = new AudioPlayer();
        ap.play(10);
        VideoPlayer vp = new VideoPlayer();
        vp.play(20);
        Player player = ap;
        player.play(30);
        player = vp;
        player.play(40);
    }
}

public abstract class Player {
    //추상클래스는 객체화가 안되고 내 자식 메소드가 abstract일 경우 클래스도 abstract가 되야한다
    //구현부가 없는 선언부
    //오버라이딩하는 강제성이 있다
    public abstract void play(int pos);
}

class AudioPlayer extends Player {
    @Override //애노테이션
    public void play(int pos){
        System.out.println("Audio Play 위치 : " + pos);
    }
}

class VideoPlayer extends Player {

    @Override
    public void play(int pos) {
        System.out.println("Video Play 위치 : " + pos);
    }
}

abstract class DvdPlayer extends Player {

}
