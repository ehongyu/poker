package org.hongyu.poker;


public enum Suit {

    SPADE('S'),
    HEART('H'),
    DIAMOND('D'),
    CLUB('C');

    private char symbol;

    Suit(char symbol)
    {
        this.symbol = symbol;
    }

    public char getSymbol()
    {
        return symbol;
    }

}