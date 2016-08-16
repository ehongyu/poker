package org.hongyu.poker;


import java.util.Arrays;

public class Hand implements Comparable<Hand> {

    public static int MAX_CARD = 5;

    private Card[] cards = new Card[MAX_CARD];

    private Card highestRankCard = null;

    public Hand(Card[] cards)
    {
        this.cards = cards;
        this.highestRankCard = this.getHighestRankCard();
    }

    public boolean isStraight()
    {
        Arrays.sort(this.cards);
        return cards[4].getRank().ordinal() - cards[0].getRank().ordinal() == 4;
    }

    public Card getHighestRankCard()
    {
        if (highestRankCard == null) {
            highestRankCard = cards[0];
            for (int i = 1; i < MAX_CARD; i++) {
                if (cards[i].compareTo(highestRankCard) > 0) {
                    highestRankCard = cards[i];
                }
            }
        }

        return highestRankCard;
    }

    public int compareTo(Hand hand)
    {
        return 0;
    }

}
