package com.bridgelabz;

public class CardsPlay {
	String[] cards = new String[52];

	public void generateCards() {

		String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		int position = 0;
		for (int i = 0; i < suit.length; i++) {
			for (int j = 0; j < rank.length; j++) {

				cards[position] = suit[i] + rank[j];
				position++;
				System.out.println(cards[position] = suit[i] + rank[j]);
			}
		}
	}
}