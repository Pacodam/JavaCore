package algorithmsRS.model;

import algorithmsRS.enums.Suit;

public class PlayingCard {

    private Suit suit;
    private int value;

    public PlayingCard(Suit suit, int value){
        this.suit = suit;
        this.value = value;
    }

    public boolean isSameSuit(PlayingCard playingCard){
        if(this.suit == playingCard.suit){
            return true;
        }
        return false;
    }

    public boolean isBigger(PlayingCard playingCard){
        if(this.value > playingCard.value){
            return true;
        }
        return false;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "PlayingCard{" +
                "suit=" + suit +
                ", value=" + value +
                '}';
    }
}



