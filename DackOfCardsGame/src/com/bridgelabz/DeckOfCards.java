package com.bridgelabz;

public class DeckOfCards {
	public static void deckOfcards() {
		String[] suits = { "Clubs", "Daimonds", "Hearts", "Spades" };
		String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "King", "Queen", "Ace" };

		int sizeOfDeck = suits.length * ranks.length;
		System.out.println("Number of cards in the Deck:" + sizeOfDeck);
		String[] deck = new String[sizeOfDeck];
		for (int i = 0; i < ranks.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				deck[suits.length * i + j] = ranks[i] + "->" + suits[j];
			}
		}
		toPrint(deck);
	}

	private static void toPrint(String[] deck) {
		System.out.println("Cards in Deck:");
		for (String element : deck) {
			System.out.print("\t" + element);
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Deck of Cards Program");
		DeckOfCards.deckOfcards();
	}
}