package com.green.day17.ch7;

import java.lang.module.Configuration;

public class PolyArgumentTest {
    public static void main(String[] args) {
        Computer c = new Computer();
        int price = c.getPrice();
        int bonusPrice = c.getBonusPrice();

        Tv tv = new Tv();
        int tvPrice = tv.getPrice(); //100
        int tvBonusPrice = tv.getBonusPrice(); //10
    }
}

class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        System.out.println(buyer); //money : 1000, bonusPoint : 0
        buyer.buy(new Tv()); //price : 100
        buyer.buy(new Computer()); //price : 200
        System.out.println(buyer); //money : 750, bonusPoint : 30

        //buyer money가 부족하면 "잔액 부족" money값 마이너스 처리x
        //잔액이 부족하지 않으면 Tv을 구입하셨습니다.
        // > money 차감처리, bonusPoint 플러스 처리
    }
}


class Buyer {
    private int money = 1000;
    private int bonusPoint;

    public void buy(Product product) {
        if(money < product.getPrice()) {
            System.out.println("잔액 부족");
            return;
        }
        money -= product.getPrice();
        bonusPoint += product.getBonusPrice();
        System.out.printf("%s을(를) 구매하셨습니다.\n", product);
    }

    public String toString() {
        return String.format("money : %d, bonusPoint : %d",money, bonusPoint);
    }
}

class Product {
    private int price;
    private int bonusPoint;
    //프라이빗 속성 두가지(괄호가 없어서)
    //생성자 >> 초기화
    //setter메소드를 통해 대입 >> 특별한 메소드 생성자 딱 한번 호출
    //setter 넣는이유 다시 수정 되게 할려고
    //setter 빼는이유 수정 안되게 할려고

    //값 빼내는법 getter메소드 통해 얻는다.

    public  Product(int price) {
        this.price = price;
        this.bonusPoint = price / 10;
    }
    public int getPrice() { return price; }
    public int getBonusPrice() { return bonusPoint; }

    public String toString() {
        return String.format(" price : %d , bonusPoint : %d", price,bonusPoint);
    }
}

class Tv extends Product {
    public Tv() {
        super(100);
    }
    public String toString() {
        return String.format("Tv");
    }
}

class Computer extends Product {
    public Computer() {
        super(200);
    }
    public String toString() {
        return "Computer";
    }
}