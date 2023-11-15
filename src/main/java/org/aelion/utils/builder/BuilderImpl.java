package org.aelion.utils.builder;

import org.aelion.models.PlayingCard;
import org.aelion.utils.Family;

public class BuilderImpl implements Builder<PlayingCard> {
    private String card;
    private Family family;

    public BuilderImpl card(String card) {
        this.card = card;
        return this;
    }

    public BuilderImpl family(Family family) {
        this.family = family;
        return this;
    }

    @Override
    public PlayingCard build() throws Exception {
        if (this.card == null || this.family == null) {
            throw new Exception("Card cannot build, something is missing");
        }
        
        PlayingCard playingCard = new PlayingCard();
        playingCard.setCard(this.card);
        playingCard.setFamily(this.family);

        return playingCard;
    }
    
}
