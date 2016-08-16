package org.hongyu.poker;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

    public List<Card> cards = null;
    Random random = new Random(System.nanoTime());

    public Deck()
    {
        getNewDeck();
    }

    public void getNewDeck()
    {
        cards = new ArrayList<>();
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                Card card = new Card(rank, suit);
                cards.add(card);
            }
        }
    }

    public void shuffle()
    {
        List<Card> newCards = new ArrayList<>();

        while (cards.size() > 0) {
            int j = random.nextInt(cards.size());
            newCards.add(cards.get(j));
            cards.remove(j);
        }

        this.cards = newCards;
    }

    public Card dealLastCard()
    {
        int lastCardIndex = cards.size() - 1;
        Card card = cards.get(lastCardIndex);
        cards.remove(lastCardIndex);

        return card;
    }

}
