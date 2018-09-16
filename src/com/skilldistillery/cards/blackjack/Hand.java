package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public abstract class Hand {
	Deck deck = new Deck();

	public Hand() {

	}

	// public abstract int getHandValue(List<Card> c);

	public void addCard(Card c) {

	}

	public void clearHand(List<Card> hand) {
		hand.clear();

	}

	public List<Card> getCards() {
		List<Card> hand = new ArrayList<>();
		hand.add(deck.hit());
		hand.add(deck.hit());

		return hand;
	}

	@Override
	public String toString() {

		return toString();
	}

}
