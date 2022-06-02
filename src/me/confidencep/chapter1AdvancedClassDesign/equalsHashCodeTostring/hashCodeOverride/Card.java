package me.confidencep.chapter1AdvancedClassDesign.equalsHashCodeTostring.hashCodeOverride;

import java.util.Objects;

public class Card {
    private String rank;
    private String suit;

    public Card(String rank, String suit) {
        if (rank == null || suit == null) {
            throw new IllegalArgumentException();
        }
        this.rank = rank;
        this.suit = suit;
    }

    public static void main(String[] args) {
        Card card = new Card("HELLO", "Suit");
        Card card1 = new Card("hello", "Suit");
        Card card2 = new Card("hellO", "Suit");
        Card card3 = new Card("heOll", "Suit");
        int rank;
        rank = card.hashCode();
        System.out.println(rank);
        rank = card1.hashCode();
        System.out.println(rank);
        rank = card2.hashCode();
        System.out.println(rank);
        rank = card3.hashCode();
        System.out.println(rank);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;
        Card card = (Card) o;
        return Objects.equals(rank, card.rank) && Objects.equals(suit, card.suit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank);
    }
}
