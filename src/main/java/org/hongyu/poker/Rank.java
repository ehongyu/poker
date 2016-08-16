package org.hongyu.poker;

public enum Rank {

    CARD_2(0, '2'),
    CARD_3(1, '3'),
    CARD_4(2, '4'),
    CARD_5(3, '5'),
    CARD_6(4, '6'),
    CARD_7(5, '7'),
    CARD_8(6, '8'),
    CARD_9(7, '9'),
    CARD_T(8, 'T'),
    CARD_J(9, 'J'),
    CARD_Q(10, 'Q'),
    CARD_K(11, 'K'),
    CARD_A(12, 'A');

    private int order;
    private char symbol;

    Rank(int order, char symbol)
    {
        this.order = order;
        this.symbol = symbol;
    }

    public int getOrder()
    {
        return order;
    }

    public char getSymbol()
    {
        return symbol;
    }

}