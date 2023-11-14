package org.aelion;

import org.aelion.models.Card;
import org.aelion.models.PlayingCard;

/**
 * Hello world!
 *
 */
public class App  {
    /**
     * Ace of heart
     */
    public Card aceOfHeart;

    public PlayingCard playingCard;

    public static void main( String[] args ) {
        App app = new App();
        app.run();
    }

    public void run() {
        this.aceOfHeart = new Card("Red", "Heart", "Ace");
        System.out.println(this.aceOfHeart);

        this.playingCard = new PlayingCard();
        this.playingCard
            .card("Ace")
            .family("Spade");

    }
}
