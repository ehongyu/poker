package org.hongyu.poker;

public class Table {

    private Deck deck = null;
    private Player[] players = null;
    private Card[] publicCards = null;
    private int playerNumber;

    public Table(int playerNumber)
    {
        this.playerNumber = playerNumber;
        reset();
    }

    public void reset()
    {
        deck = new Deck();
        publicCards = new Card[3];
        players = new Player[playerNumber];
        for (int i=0; i<playerNumber; i++) {
            players[i] = new Player();
        }
    }

    public void dealHand()
    {
        deck.shuffle();
        this.dealCardsToPlayers();
        this.dealPublicCards();
    }

    public void dealCardsToPlayers()
    {
        for(int i=0; i<players.length; i++) {
            players[i] = new Player(deck.dealLastCard(), deck.dealLastCard());
        }
    }

    public void dealPublicCards()
    {
        publicCards = new Card[3];

        for (int i=0; i<3; i++) {
            deck.dealLastCard(); // burn
            publicCards[i] = deck.dealLastCard();
        }
    }


    public static void main(String[] args)
    {
        Table table = new Table(9);
        table.dealCardsToPlayers();

        return;
    }

}
