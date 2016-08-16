package org.hongyu.poker;

public class Game {

    private Deck deck = null;
    private Player[] players = null;
    private Card[] pubCards = null;
    private int playerNumber;

    public Game(int playerNumber)
    {
        this.playerNumber = playerNumber;
        reset();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return playerNumber == game.playerNumber &&
                com.google.common.base.Objects.equal(deck, game.deck) &&
                com.google.common.base.Objects.equal(players, game.players) &&
                com.google.common.base.Objects.equal(pubCards, game.pubCards);
    }

    @Override
    public int hashCode() {
        return com.google.common.base.Objects.hashCode(deck, players, pubCards, playerNumber);
    }

    public void reset()
    {
        deck = new Deck();
        pubCards = new Card[3];

        players = new Player[playerNumber];
        for (int i=0; i<playerNumber; i++) {
            players[i] = new Player();
        }
    }

    public void dealHand()
    {
        deck.shuffle();
        this.dealHoleCards();
        this.dealPubCards();
    }

    public void dealHoleCards()
    {
        for(int i=0; i<players.length; i++) {
            players[i] = new Player(deck.dealLastCard(), deck.dealLastCard());
        }
    }

    public void dealPubCards()
    {
         pubCards = new Card[3];

        for (int i=0; i<3; i++) {
            deck.dealLastCard(); // burn one card
            pubCards[i] = deck.dealLastCard();
        }
    }

    public Player[] getPlayers()
    {
        return players;
    }
}
