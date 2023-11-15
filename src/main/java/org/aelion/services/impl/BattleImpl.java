package org.aelion.services.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.aelion.models.Player;
import org.aelion.models.PlayingCard;
import org.aelion.services.CardGame;
import org.aelion.services.exceptions.NotEnoughPlayerException;
import org.aelion.services.exceptions.TooManyPlayerException;
import org.aelion.utils.Data;

public class BattleImpl implements CardGame {
    private List<Player> players = new ArrayList<>();

    @Override
    public void addPlayer(Player player) {
        if (this.players.size() < 2) {
            this.players.add(player);
        } else {
            throw new TooManyPlayerException("Battle cannot have more than 2 players");
        }
    }

    @Override
    public void distribute() {
        if (this.players.size() < 2) {
            throw new NotEnoughPlayerException("Unable to distribute with less than 2 players");
        }

        // Get full cards deck from Data class
        ArrayList<PlayingCard> deck = (ArrayList<PlayingCard>) Data.createDeck();

        // Shuffle deck
        Collections.shuffle(deck);

        // 26 cards for player one
        ArrayList<PlayingCard> subList = new ArrayList<PlayingCard>(deck.subList(0, 26));
        this.players.get(0).setCards(subList);

        // 26 cards for player two
        subList = new ArrayList<PlayingCard>(deck.subList(26, 52));
        this.players.get(1).setCards(subList);
        
    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'play'");
    }
    
}
