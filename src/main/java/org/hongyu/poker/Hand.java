package org.hongyu.poker;


import com.google.common.base.Objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hand implements Comparable<Hand> {

    private Card[] cards = null;

    private List<Hand> straights = new ArrayList<Hand>();

    private List<Hand> flushes = new ArrayList<Hand>();

    private List<Hand> trips = new ArrayList<Hand>();

    private List<Hand> quarz = new ArrayList<Hand>();

    private List<Hand> pairs = new ArrayList<Hand>();


    public Hand(Card[] cards)
    {
        this.cards = cards.clone();
        Arrays.sort(cards);
    }

    public Card getLow()
    {
        return cards[0];
    }

    public Card getHigh()
    {
        return cards[0];
    }


    public int compareTo(Hand hand)
    {
        // is equals
        if (this.equals(hand)) {
            return 0;
        }

        // if this is straight flush

        // if this is quartz

        // ...

        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hand hand = (Hand) o;
        return Objects.equal(cards, hand.cards);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cards);
    }


    public void findHands()
    {
        findStraights();
        findFlushes();
        findQuartz();
        findTrips();
        findPairs();
    }

    public Card getHighestRankCard()
    {
        return cards[cards.length-1];
    }


    public void findStraights() {

        // if last card is A, use it as the starting card for straight
        if (getHighestRankCard().getRank().equals(Rank.CARD_A) &&
                cards[3].getRank().ordinal() - cards[0].getRank().ordinal() == 3) {

            Card[] arr = new Card[5];
            arr[0] = getHighestRankCard();
            arr[1] = cards[0];
            arr[2] = cards[1];
            arr[3] = cards[2];
            arr[4] = cards[3];
            this.straights.add(new Hand(arr));

        }

        for (int i = 0; i < cards.length - 5; i++) {
            if (cards[i + 4].getRank().ordinal() - cards[i].getRank().ordinal() == 4) {
                Card[] arr = new Card[5];
                arr[0] = cards[0];
                arr[1] = cards[1];
                arr[2] = cards[2];
                arr[3] = cards[3];
                arr[4] = cards[4];
                this.straights.add(new Hand(arr));
            }
        }

    }

    public void findFlushes()
    {
//        for (int i=1; i<cards.length; i++) {
//            if (cards[0].getSuit() != cards[i].getSuit()) {
//                return false;
//            }
//        }
//        return true;
    }

    public void findQuartz() {
//        return null;
    }


    public void findTrips()
    {
//        return null;
    }

    public void findPairs()
    {
//        return null;
    }

}
