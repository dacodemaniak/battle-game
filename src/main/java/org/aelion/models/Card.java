package org.aelion.models;

public class Card {
    /**
     * Color of a card
     */
    private String color;
    /**
     * Card family
     */
    private String family;
    /**
     * Card itself
     */
    private String card;

    public Card() {}

    public Card(String color, String family, String card) {
        this.color = color;
        this.family = family;
        this.card = card;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String toString() {
        return this.card + " of " + this.family;
    }
}
