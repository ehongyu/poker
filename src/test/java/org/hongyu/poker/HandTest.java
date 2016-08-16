package org.hongyu.poker;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HandTest {

    @Test
    public void testIsStraight()
    {
        Card cards[] = new Card[5];
        cards[0] = new Card(Rank.CARD_2, Suit.CLUB);
        cards[1] = new Card(Rank.CARD_3, Suit.CLUB);
        cards[2] = new Card(Rank.CARD_4, Suit.CLUB);
        cards[3] = new Card(Rank.CARD_5, Suit.CLUB);
        cards[4] = new Card(Rank.CARD_6, Suit.CLUB);

        Hand hand = new Hand(cards);
        Assert.assertTrue(hand.isStraight());
    }
}
