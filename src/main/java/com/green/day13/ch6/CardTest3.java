package com.green.day13.ch6;

class Card {
    String pattern; //Spade, Heart
    String denamination; //A, 2~10, J, Q, K

    void printYourSelf() {
        System.out.printf("%s : (%s)\n",pattern, denamination);
    }
}
public class CardTest3 {
    public static void main(String[] args) {

        Card[] cards = makeCards();
        System.out.println(cards.length);

        for(Card c : cards){
            c.printYourSelf();
        }
    }


    public static Card[] makeCards() {

        String[] kinds = { "Spade", "Heart", "Diamond", "Club" };
        Card[] Arr = new Card[52];
        int a = 0;
        for (int i = 0; i < kinds.length; i++) {
            for (int z = 1; z <= 13; z++) {
                Card ca = new Card();
                String grade = Integer.toString(z);
                if (z == 1) {
                    grade = "A";
                } else if (z == 11) {
                    grade = "J";
                } else if (z == 12) {
                    grade = "Q";
                } else if (z == 13) {
                    grade = "K";
                }
                ca.pattern = kinds[i];
                ca.denamination = grade;
                Arr[a++] = ca;
            }
        }return Arr;
    }
}

