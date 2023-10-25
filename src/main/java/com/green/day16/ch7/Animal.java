package com.green.day16.ch7;

public class Animal {
    public void crying() {
        System.out.println("동물이 운다.");
    }
}

class AnimalTest {
    public static void main(String[] args) {
        //1.부모타입은 자식 객체 주소값 담을 수 있다.
        Dog d1 = new Bulldog();
        Animal ani1 = new Bulldog();
        Animal ani2 = new Dog();
        Animal ani3 = new Cat();

        //2.자식타입은 부모 객체 주소값 담을 수 없다.
        //Bulldog bull1 = new Dog();
        System.out.println("끝");

        //3.타입은 알고있는 메소드만 호출할 수 있고 호출이 된다면 객체 기준이다.
        Bulldog bull3 = new Bulldog();
        bull3.jump();
        bull3.crying();

        Dog dog2 = new Bulldog();
        //dog2.jump();
        dog2.crying();
    }
}

class AnimalTest3 {
    public static void main(String[] args) {
        Animal ani = new Cat();
        System.out.println(ani instanceof Dog);
        //Dog dog = (Dog)ani;
        System.out.println(ani instanceof Cat); //왼쪽 변수 인스턴스오브 오른쪽 클래스
        Cat cat = (Cat)ani;
        System.out.println("--끝--");
    }
}

class AnumalTest2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bulldog bulldog = new Bulldog();

        callCrying(dog);
        callCrying(cat);
        callCrying(bulldog);
    }
    public static void callCrying(Animal animal) {
        animal.crying();
        if (animal instanceof Bulldog) {
            //주소값  형변환 -> //클래스 가능하면 true 불가능 false
            //if문 안에 쓸 수 있는건 boolen타입
            //while문도 boolen
            Bulldog bulldog = (Bulldog)animal;
            bulldog.jump();
        }
    }
}

class Dog extends Animal {
    @Override
    public void crying() {
        System.out.println("멍! 멍!");
    }
}

class Bulldog extends Dog {
    @Override
    public void crying() {
        System.out.println("불독이 왈! 왈!");
    }

    public void jump() {
        System.out.println("불독이 점프! 점프!");
    }
}

class Cat extends Animal {
    public void crying() {
        System.out.println("야옹~ 야옹~");
    }
}