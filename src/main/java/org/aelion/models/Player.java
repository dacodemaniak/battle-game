package org.aelion.models;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private ArrayList<PlayingCard> cards = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setCards(ArrayList<PlayingCard> cards) {
        this.cards = cards;
    }

    public List<PlayingCard> getCards() {
        return this.cards;
    }
}
