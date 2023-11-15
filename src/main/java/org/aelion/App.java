package org.aelion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.aelion.models.Card;
import org.aelion.models.Player;
import org.aelion.models.PlayingCard;
import org.aelion.services.CardGame;
import org.aelion.services.impl.BattleImpl;
import org.aelion.utils.Data;
import org.aelion.utils.Family;

/**
 * Hello world!
 *
 */
public class App  {

    public Player player1;
    public Player player2;
    public static void main( String[] args ) {
        App app = new App();
        app.run();
    }

    public void run() {
        this.player1 = new Player();
        this.player1.setName("Player 1");
        

        this.player2 = new Player();
        this.player2.setName(("Player 2"));

        // Create a new BattleGame
        CardGame battle = new BattleImpl();
        battle.addPlayer(player1);
        battle.addPlayer(player2);

        // Card distribution
        battle.distribute();
    }
}
