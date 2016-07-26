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

    public static void main(String[] args)
    {
        Card cards[] = new Card[5];
        cards[0] = new Card(Rank.CARD_2, Suit.CLUB);
        cards[1] = new Card(Rank.CARD_3, Suit.CLUB);
        cards[2] = new Card(Rank.CARD_4, Suit.CLUB);
        cards[3] = new Card(Rank.CARD_5, Suit.CLUB);
        cards[4] = new Card(Rank.CARD_6, Suit.CLUB);

        Hand hand = new Hand(cards);
        System.out.println(hand.isStraight());
    }
}
