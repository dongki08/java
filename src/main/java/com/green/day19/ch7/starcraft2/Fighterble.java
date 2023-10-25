package com.green.day19.ch7.starcraft2;

public interface Fighterble extends Movable, Attackable {}

interface Movable {
    void move(int x, int y); //추상메소드는 강제성이 있다
}

interface Attackable {
    void attack(Unit u);
}

class Unit {
    private int currentHp;
    private int x;
    private int y;

}

class Fighter extends Unit implements Fighterble {

    @Override
    public void move(int x, int y) {

    }

    @Override
    public void attack(Unit u) {

    }
}

class FighterTest {
    public static void main(String[] args) {
        Movable movable = new Fighter();
        movable.move(10, 20);
        //movable.attack(new Unit());
        //attack 메소드 호출하고 싶다.
        Fighter fighter = (Fighter)movable;
        fighter.attack(null);

        Attackable attackable = (Attackable)movable;
        attackable.attack(null);
    }
}
