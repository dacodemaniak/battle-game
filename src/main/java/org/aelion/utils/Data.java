package org.aelion.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.aelion.models.PlayingCard;
import org.aelion.utils.builder.Builder;
import org.aelion.utils.builder.BuilderImpl;

public class Data {
    private static String[] cards = {
        "Ace",
        "2", "3", "4", "5", "6", "7", "8", "9", "10",
        "Jack", "Queen", "King"
    };

    private static Builder<PlayingCard> builder = new BuilderImpl();

    private static Integer upperBound = 52;

    public static List<PlayingCard> createDeck() {
        ArrayList<PlayingCard> cards = new ArrayList<>();
        
        for (Family family : Family.values()) {
            for (String figure : Data.cards) {
                ((BuilderImpl) Data.builder)
                    .card(figure)
                    .family(family);

                try {
                    cards.add(Data.builder.build());
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        return cards;
    }

    public static Set<PlayingCard> setupDesk() {
        HashSet<PlayingCard> cards = new HashSet<>();

        for (Family family : Family.values()) {
            for (String figure : Data.cards) {
                ((BuilderImpl) Data.builder)
                .card(figure)
                .family(family);

                try {
                    cards.add(Data.builder.build());
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        return cards;
    }

    public static List<PlayingCard> distribute() {
        // Get the full desk (52 cards)
        List<PlayingCard> desk = Data.createDeck();

        // Prepare a desk (empty ArrayList)
        List<PlayingCard> playerDesk = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            // Use Random class to pick random integer
            Random random = new Random();
            int indice = random.nextInt(Data.upperBound);

            // Add card into player desk
            playerDesk.add(desk.get(indice));

            // Unstack item from desk
            desk.remove(indice);

            // Decrement upperbound
            Data.upperBound--;
        }
        return playerDesk;

    }
}
