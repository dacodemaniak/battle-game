package org.aelion;

import org.aelion.models.Card;
import org.aelion.models.PlayingCard;
import org.aelion.utils.Family;

/**
 * Hello world!
 *
 */
public class App  {
    /**
     * Ace of heart
     */
    public PlayingCard aceOfHeart;

    public PlayingCard playingCard;

    public static void main( String[] args ) {
        App app = new App();
        app.run();
    }

    public void run() {
        this.aceOfHeart = new PlayingCard();
        this.aceOfHeart.setColor("Red");
        this.aceOfHeart.setFamily(Family.HEARTS);
        this.aceOfHeart.setCard("Ace");
    }
}
