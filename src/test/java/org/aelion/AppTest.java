package org.aelion;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void testAceOfHeart() {
        App app = new App();
        app.run();
        assertEquals(app.aceOfHeart.getCard(), "Ace");
    }

    @Test
    public void testPlayingCardIsAnAce() {
        App app = new App();
        app.run();
        assertEquals(app.playingCard.card(), "Ace");
    }
}
