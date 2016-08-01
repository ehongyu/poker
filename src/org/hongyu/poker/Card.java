package org.hongyu.poker;


public class Card implements Comparable<Card> {


    private Rank rank;
    private Suit suit;


    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public String toString()
    {
        return this.getRank().getSymbol() + " " + this.getSuit().getSymbol();
    }

    public int compareTo(Card card) {
        return this.getRank().compareTo(card.getRank());
    }

}
