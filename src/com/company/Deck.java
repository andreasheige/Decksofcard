package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private ArrayList<Card> theDeck;

    public Deck() {
        this.reset();
    }

    public void reset() {
        theDeck = new ArrayList<Card>();
        for (Suits suit : Suits.values()) {
            for (int i = 1; i <= 13; i++) {
                //Går igenom allt som finns i enum
                Card card = new Card(i, suit);
                theDeck.add(card);
            }
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (Card card : theDeck) {
            result += card + "\n";
        }
        return result;
    }

    private void swap(int first, int second) {
        Card tmpCard = theDeck.get(first);//Skapar ett temporärtkort för att inte radea
        theDeck.set(first, theDeck.get(second));
        theDeck.set(second, tmpCard);
    }

    public void shuffle() {
        Random rand = new Random();
        for (int i = 0; i < 10000; i++) {
            int first = rand.nextInt(theDeck.size());
            int second = rand.nextInt(theDeck.size());
            swap(first, second);
        }
    }

    public Card dealOne() {
        //OBS
        //Vi borde kolla om kortleken har något kort först
        Random rand = new Random();
        return theDeck.remove(rand.nextInt(theDeck.size()));
    }
}