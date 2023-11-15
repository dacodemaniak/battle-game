package org.aelion;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void playerHasHisOwnDesk() {
        App app = new App();
        app.run();

        assertEquals(app.player1.getName(), "Player 1");
        assertEquals(app.player2.getName(), "Player 2");

        assertEquals(26, app.player1.getCards().size());
        assertEquals(26, app.player2.getCards().size());
    }
}
