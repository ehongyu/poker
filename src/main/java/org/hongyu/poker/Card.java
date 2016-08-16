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


    public int compareTo(Card card)
    {
        return this.getRank().compareTo(card.getRank());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return rank == card.rank &&
                suit == card.suit;
    }

    @Override
    public int hashCode() {
        return com.google.common.base.Objects.hashCode(rank, suit);
    }
}