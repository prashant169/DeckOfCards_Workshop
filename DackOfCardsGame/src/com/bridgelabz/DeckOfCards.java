package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class DeckOfCards {
	Scanner scanner = new Scanner(System.in);
	public ArrayList<String> cardsDeck = new ArrayList<String>();

	public ArrayList<String> makeADeck() {
		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "King", "Queen", "Ace" };
		int numOfCards = suits.length * ranks.length;
		System.out.println("Number of cards in the deck:" + numOfCards);

		for (int i = 0; i < ranks.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				cardsDeck.add(ranks[i] + "->" + suits[j]);
			}
		}
		toDisplay(cardsDeck);
		return cardsDeck;
	}

	public static void toshuffle(ArrayList<String> cardsDeck, int player) {
		System.out.println("shuffling the cards before Distribution");
		ArrayList<String> temp = new ArrayList<String>();
		while (!cardsDeck.isEmpty()) {
			int loc = (int) (Math.random() * cardsDeck.size());
			temp.add(cardsDeck.get(loc));
			cardsDeck.remove(loc);
		}
		cardsDeck = temp;
		toDisplay(cardsDeck);
		cardDistribution(cardsDeck, player);
	}

	private static void toDisplay(ArrayList<String> cardsDeck) {
		System.out.println("Cards in Deck ");
		for (String element : cardsDeck) {
			System.out.print("\t" + element);
		}
		System.out.println();
	}

	private void noOfPlayers() {
		System.out.println("\n Enter number of players minimum 2 or 3 or 4");
		int player = scanner.nextInt();
		if (player >= 2 && player <= 4) {
			System.out.println(player + " will players will  play the game");
			sequenceOfPlay(player);

		} else {
			System.out.println("please enter number of players in the Range");
			this.noOfPlayers();
		}
	}

	public void sequenceOfPlay(int player) {
		toshuffle(cardsDeck, player);
	}

	private static void cardDistribution(ArrayList<String> cardsDeck, int player) {
		ArrayList<String> storageDeck = new ArrayList<>();
		for (int i = 0; i < cardsDeck.size(); i++) {
			storageDeck.add(cardsDeck.get(i));
		}
		for (int i = 0; i < player; i++) {
			System.out.print("\nPlayer " + (i + 1) + " got cards:\n");
			for (int j = 0; j < 9; j++) {
				System.out.print("\t" + storageDeck.get(i + j * player));
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Deck of Cards Program");
		DeckOfCards deck = new DeckOfCards();
		deck.makeADeck();
		deck.noOfPlayers();
	}
}