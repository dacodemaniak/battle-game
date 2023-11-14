package org.aelion.models;

public class PlayingCard {
    private String card;
    private String family;

    public PlayingCard card(String card) {
        this.card = card;
        return this; // Use to chain methods
    }

    public String card() {
        return this.card;
    }

    public PlayingCard family(String family) {
        this.family = family;
        return this;
    }

    public String family() {
        return this.family;
    }
}
