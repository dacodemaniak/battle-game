package org.aelion.services;

import org.aelion.models.Player;

public interface CardGame {
    /**
     * Add a player for the card game
     * @param player
     */
    void addPlayer(Player player);

    void distribute();

    void play();
}
