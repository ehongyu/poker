package org.hongyu.poker;


import org.testng.Assert;
import org.testng.annotations.Test;


public class GameTest {


    @Test
    public void testGame()
    {
        Game game = new Game(9);
        game.dealCardsToPlayers();

        Assert.assertEquals(9, game.getPlayers().length);
    }

}
