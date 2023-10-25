package com.green.day17.ch7;

import com.green.day2.ch2.Printf;

import java.util.HashMap;
import java.util.Map;

public class PolyArgumentTestVer2 {
    public static void main(String[] args) {
        Product2 p = new Product2("박동현", 1000);
        System.out.println(p);
    }
}
class PolyArgumentTestVer2_2 {
    public static void main(String[] args) {
        Tv2 tv = new Tv2();
        System.out.println(tv); //name : Tv, price : 100, bonusPoint : 10
        Computer2 com = new Computer2();
        System.out.println(com);
        Audio2 audio = new Audio2();
        System.out.println(audio);
    }
}
class PolyArgumentTestVer2_3 {
    public static void main(String[] args) {
        Buyer2 buyer = new Buyer2();
        buyer.buy(new Tv2());
        buyer.buy(new Computer2());
        buyer.buy(new Audio2());
        buyer.buy(new Audio2());
        buyer.buy(new Audio2());
        buyer.buy(new Audio2());
        buyer.buy(new Audio2());
        buyer.buy(new Audio2());
        buyer.buy(new Audio2());
        buyer.buy(new Audio2());
        buyer.buy(new Audio2());
        buyer.buy(new Audio2());
        buyer.buy(new Computer2());

        Product2[] arr = buyer.product2;
        for(int i = 0; i < arr.length; i++) {
            Product2 p = arr[i];
            System.out.printf("arr[%d] : %s\n",i ,p);
        }
    }
}

class PolyArgumentTestVer2_4{
    public static void main(String[] args) {
        Buyer3 buyer = new Buyer3();
        buyer.buy(new Computer2());
        buyer.buy(new Computer2());
        buyer.buy(new Computer2());
        buyer.buy(new Tv2());
        buyer.buy(new Audio2());
        buyer.buy(new Audio2());
    }
}

class Buyer2 {
    private int money;
    private int bonusPoint;
    Product2[] product2;
    //money(정수) 저장 가능
    //bonusPoint(정수) 저장 가능
    //Product2 객체의 주소값 10개 저장 가능
    public Buyer2() {
        this.money = 10000;
        this.bonusPoint = 0;
        product2 = new Product2[10];
    }
    int i = 0;
    public void buy(Product2 p) {
        if(i == product2.length) {
            System.out.println("담을 수 있는 공간이 없습니다.");
            return;
        }
        if(money < p.getPrice()) {
            System.out.println("잔액 부족");
            return;
        }
        this.product2[i++] = p;
        money -= p.getPrice();
        bonusPoint += p.getBonusPoint();

        System.out.printf("%s를 구매하셨습니다\n",p.getName());
    }
}


class Buyer3 {
    private int money;
    private int bonusPoint;
    Product2[] product2;
    private int i;
    private Map<String, Integer> buyItems;
    //money(정수) 저장 가능
    //bonusPoint(정수) 저장 가능
    //Product2 객체의 주소값 10개 저장 가능
    public Buyer3() {
        buyItems = new HashMap();
        this.money = 10000;
        this.bonusPoint = 0;
        product2 = new Product2[10];
    }
    int z = 0;
    public void buy(Product2 p) {
        if(z == product2.length) {
            System.out.println("담을 수 있는 공간이 없습니다.");
            return;
        }
        if(money < p.getPrice()) {
            System.out.println("잔액 부족");
            return;
        }
        this.product2[i++] = p;
        money -= p.getPrice();
        bonusPoint += p.getBonusPoint();
        String productName = p.getName();
        if(buyItems.containsKey(productName)) {
            buyItems.put(productName, buyItems.get(productName + 1));
        }else {
            buyItems.put(productName, 1);
        }
        System.out.printf("%s를 구매하셨습니다\n",p.getName());
    }
}








class Computer2 extends Product2 {
    public Computer2() {
        super("Computer", 200);
    }
}

class Tv2 extends Product2 {
    public Tv2() {
        super("Tv", 100);
    }
}

class Product2 {
    private String name;
    private int price;
    private int bonusPoint;

    public Product2(String name, int price) {
        this.name = name;
        this.price = price;
        this.bonusPoint = price / 10;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getBonusPoint() {
        return bonusPoint;
    }
    public String toString () {
        return String.format("제품명 : %s, price : %d, bonusPoint : %d", name, price ,bonusPoint);
    }
}
class Audio2 extends Product2{
    public Audio2() {
        super("Audio", 500);
    }
}