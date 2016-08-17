package org.hongyu.poker;

import org.testng.Assert;
import org.testng.annotations.Test;


public class CardTest {

    @Test
    public void testCompare() throws Exception {
        Card card = new Card(Rank.CARD_A, Suit.CLUB);
        Card card2 = new Card(Rank.CARD_A, Suit.DIAMOND);

        Assert.assertEquals(0, card.compareTo(card2));
    }

}