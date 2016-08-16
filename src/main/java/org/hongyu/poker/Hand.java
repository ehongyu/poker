package org.hongyu.poker;


import java.util.Arrays;

public class Hand implements Comparable<Hand> {

    private Card[] cards = new Card[5];

    public Hand(Card[] cards)
    {
        this.cards = cards;
    }

    public boolean isStraight()
    {
        Arrays.sort(this.cards);
        return cards[4].getRank().ordinal() - cards[0].getRank().ordinal() == 4;
    }

    public int compareTo(Hand hand)
    {
        return 0;
    }

}
