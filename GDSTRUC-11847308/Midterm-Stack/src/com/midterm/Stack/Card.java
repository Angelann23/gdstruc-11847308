package com.midterm.Stack;

import java.util.Objects;

public class Card {
    private int cardNum;
    private String cardName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return cardNum == card.cardNum && Objects.equals(cardName, card.cardName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNum, cardName);
    }

    public Card(int cardNum, String cardName) {
        this.cardNum = cardNum;
        this.cardName = cardName;
    }

    public int getCardNum() {
        return cardNum;
    }

    public void setCardNum(int cardNum) {
        this.cardNum = cardNum;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardNum=" + cardNum +
                ", cardName='" + cardName + '\'' +
                '}';
    }
}
