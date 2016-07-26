package org.hongyu.poker;


public class Card implements Comparable<Card> {


    private Rank rank;
    private Suit suit;


    public Card(Rank rank, Suit suit) {
        this.setRank(rank);
        this.setSuit(suit);
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }


    public String toString()
    {
        return this.getRank().getSymbol() + " " + this.getSuit().getSymbol();
    }

    public int compareTo(Card card) {
        return this.getRank().compareTo(card.getRank());
    }


    public static void main(String[] argv)
    {
        Card card = new Card(Rank.CARD_A, Suit.CLUB);
        Card card2 = new Card(Rank.CARD_2, Suit.DIAMOND);
        System.out.println(card.compareTo(card2));

//        for (Rank rank : Rank.values()) {
//            System.out.println(rank.getSymbol());
//        }
//
//        for (Suit suit : Suit.values()) {
//            System.out.println(suit);
//        }
    }

}
