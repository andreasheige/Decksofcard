package com.company;

public class Main {

    public static void main(String[] args) {
     Deck deck = new Deck();
     deck.shuffle();
     for (int i =0; i <5; i++){
         Card card = deck.dealOne();
            System.out.println(card);
     }
        }
    }

