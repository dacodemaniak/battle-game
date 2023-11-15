package org.aelion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.aelion.models.Card;
import org.aelion.models.Player;
import org.aelion.models.PlayingCard;
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
        this.player1.setCards((ArrayList<PlayingCard>) Data.distribute());

        this.player2 = new Player();
        this.player2.setName(("Player 2"));
        this.player2.setCards((ArrayList<PlayingCard>) Data.distribute());
    }
}
