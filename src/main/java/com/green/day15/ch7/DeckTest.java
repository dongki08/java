package com.green.day15.ch7;

import com.green.day14.ch6.Car;

class Card extends Object{
    static final int KIND_MAX = 4; //카드 무늬의 수, 스태틱이 붙으면 객채화가 필요없다 메모리바로 올라감 공간이 하나
    static final int NUM_MAX = 13; //무늬별 카드 수

    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLUB = 1;
    int kind;
    int number;

    public Card() {
        this(SPADE, 1);
    }

    public Card(int a, int b) {
        kind = a;
        number = b;
    }
    @Override
    public String toString() {

        return String.format("kind : %d, number : %d", kind, number);
    }
}

class Deck {
    final int CARD_NUM = 52;
    Card[] cardArr = new Card[CARD_NUM];
    public Deck() {
        int idx = 0;
        for (int i = 1; i <= Card.KIND_MAX; i++) {
            for (int z = 1; z <= Card.NUM_MAX; z++) {
                cardArr[idx++] = new Card(i, z);
            }
        }

        for(Card c : cardArr) {
            System.out.println(c);
        }
    }

    public Card pick(int a) {
        return cardArr[a];
    }

    public Card pick() {
        int indx = (int)(Math.random() * cardArr.length);
        return cardArr[indx];
    }

    public void shuffle() {
        for(int i = 0; i < cardArr.length; i++) {
            int rIdx = (int) (Math.random() * cardArr.length);

            Card tmp = cardArr[i];
            cardArr[i] = cardArr[rIdx];
            cardArr[rIdx] = tmp;

        }
        for(Card c : cardArr) {
            System.out.println(c);
        }
    }
}

public class DeckTest {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
    }
}
