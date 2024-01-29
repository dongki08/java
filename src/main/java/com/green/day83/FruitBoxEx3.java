package com.green.day83;

import org.checkerframework.checker.units.qual.A;

public class FruitBoxEx3 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitGBoxList = new FruitBox();
        fruitGBoxList.add(new Apple());
        fruitGBoxList.add(new Apple());
        fruitGBoxList.add(new Grape());

        Juice j1 = Juicer.makeJuice(fruitGBoxList);
        System.out.println("j1 : " + j1);

        FruitBox<Apple> appleFruitBox = new FruitBox();
        appleFruitBox.add(new Apple());
        appleFruitBox.add(new Apple());

        Juice j3 = Juicer.makeJuice(appleFruitBox);
        System.out.println("j3 : " + j3);

//        FruitBox<Toy> totGboxList = new FruitBox();
//        totGboxList.add(new Toy());
//        totGboxList.add(new Toy());
//
//        Juicer j2 = Juicer.makeJuice(totGboxList);
    }
}

class Juice {
    private String name;

    Juice(String name) {
        this.name = name + "Juice";
    }

    public String toString() {
        return this.name;
    }
}

class Juicer {
    static Juice makeJuice(FruitBox<? extends Fruit> box) {
        String temp = "";
        for(Fruit f : box.getList()) {
            temp += f + " ";
        }
        return new Juice(temp);
    }
}
