package com.company;

public class Card {
    private int rank;
    private Suits suit; //ÄNdra vid enun

    public Card (int rank, Suits suit){ //Ändra vid enum
        this.rank = rank;
        this.suit = suit;

    }

    @Override
    public String toString() {
        String rankString =  Integer.toString(rank);
        switch (rank) {
            case 1:
                rankString = "Ace";
                break;
            case 11:
                rankString = "Jack";
                break;
            case 12:
                rankString = "Queen";
                break;
            case 13:
                rankString = "King";
                break;
        }

        char suitChar = ' ';
        switch(suit){
            case Spades:
                suitChar = '\u2660';
                break;
            case Clubs:
                suitChar = '\u2666';
                break;
            case Diamonds:
                suitChar = '\u2663';
                break;
            case Hearts:
                suitChar = '\u2665';
                break;
        }

        return  rankString + " of " + suitChar;
    }
}