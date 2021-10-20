package com.deckofcards;

public class DeckOfCards {

	public static void main(String[] args) {

		/*
		 * creating the array for suit and rank
		 */

		String[] suit = { "Clubs", "Diamons", "Spades", "Hearts" };
		String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

		// declaring 2D array to set the deck of card
		String[][] deck = new String[suit.length][rank.length];

		for (int i = 0; i < suit.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				deck[i][j] = suit[i] + " " + rank[j];
			}
		}
	}
}
