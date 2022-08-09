package com.bl.DeckOfCards;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.LinkedList;

public class DeckOfCards {
	static int PLAYERS = 4;
	static int CARDS_OF_EACH_PLAYER = 9;

	public static void main(String[] args) {

		shuffleCards();
		ArrayList<DeckOfCards> deck = new ArrayList();

	}

	public static void shuffleCards() {
		

		String[] SUITS = { "Clubs", "Diamonds", "Hearts", "Spades" };

		String[] RANKS = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		
		Arrays.sort(RANKS);
		System.out.println(" ranks sort : " + Arrays.toString(RANKS));
		
		String[] player = { "player1", "player2", "player3", "player4" };

		
		int numOfCards = SUITS.length * RANKS.length;
		// System.out.println("cards are : " + numOfCards);

		String[] deck = new String[numOfCards];

		System.out.println(deck);

		for (int i = 0; i < RANKS.length; i++) {

			for (int j = 0; j < SUITS.length; j++) {
				deck[SUITS.length * i + j] = RANKS[i].toString() + " " + SUITS[j].toString();
				
		
			}

		}

		// shuffle the cards

		for (int i = 0; i < numOfCards; i++) {

			int r = i + (int) (Math.random() * (numOfCards - i));

			String temp = deck[r];
			deck[r] = deck[i];
			deck[r] = temp;

			// System.out.print("cards: " + deck[i]);
		}

		for (int i = 1; i <= PLAYERS; i++) {
			
			System.out.print("Player : " + i + " -> ");
			//System.out.println("                                    ");
			for (int j = 0; j < CARDS_OF_EACH_PLAYER; j++) {
				//System.out.println(player[i] +"  ");
				Arrays.sort(deck);
				System.out.print((deck[j] + "    "));
			}
			
			System.out.println();
		}
	
		
	
	}
	
	
	

	
	
}
