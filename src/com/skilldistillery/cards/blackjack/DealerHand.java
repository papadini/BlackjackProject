package com.skilldistillery.cards.blackjack;

import java.util.List;

import com.skilldistillery.cards.common.Card;

public class DealerHand extends Hand {
	Card card = new Card();

	public DealerHand() {

	}

	public int getPlayerHand(List<Card> c) {
		int handValue = 0;
		for (Card card : c) {
			int cValue = card.getValue();
			handValue += cValue;
		}

		System.out.println("Player total: " + handValue);
		return handValue;

	}

	public int getDealerHand(List<Card> c) {
		int handValue = 0;
		for (Card card : c) {
			int cValue = card.getValue();
			handValue += cValue;
		}

		System.out.println("Dealer total: " + handValue);
		return handValue;

	}

	public void shuffle() {
		deck.shuffleDeck();
	}

	public int size() {
		return deck.checkDeckSize();
	}

}
