package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Create a class Deck. It will hold a List of Cards.
//In the constructor, initialize the List with all 52 cards.
//Add a method checkDeckSize which returns the number of cards still in the deck.
//Add a method dealCard that removes a Card from the deck.
//Add a method shuffle to shuffle the deck.

public class Deck {
	private List<Card> deck;

	public Deck() {
		deck = new ArrayList<>();
		for (int suit = 0; suit < Suit.values().length; suit++) {
			Suit s = Suit.values()[suit];
			for (Rank r : Rank.values()) {
				Card c = new Card(s, r);
				deck.add(c);

			}

		}

	}

	public int checkDeckSize() {
		int deckSize = deck.size();
		System.out.println(deckSize);

		return deckSize;
	}

	public Card hit() {
		Card hit = deck.remove(0);

		return hit;
	}

	public List<Card> shuffleDeck() {

		Collections.shuffle(deck);

		return deck;

	}

}
