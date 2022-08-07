package com.bl.DeckOfCards;

public class DeckOfCards {

	public static void main(String[] args) {
		
		shuffleCards();
		
	}
		public static void shuffleCards() {

		String[] SUITS = { "Clubs", "Diamonds", "Hearts", "Spades" };

		String[] RANKS = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

		int numOfCards = SUITS.length * RANKS.length;

		String[] deck = new String[numOfCards];
		for (int i = 0; i < RANKS.length; i++) {
			for (int j = 0; j < SUITS.length; j++) {
				deck[SUITS.length * i + j] = RANKS[i] + " of " + SUITS[j];

			}
		}

		for (int i = 0; i < numOfCards; i++) {
			int r = i + (int) (Math.random() * (numOfCards - i));
			String temp = deck[r];
			deck[r] = deck[i];
			deck[i] = temp;
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 9; j++)
				System.out.println(deck[i]);
		}
	}
}
