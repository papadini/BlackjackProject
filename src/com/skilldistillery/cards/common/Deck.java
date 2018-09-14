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
				Card c = new Card(s,r);
				deck.add(c);
			
			}
//			for (int rank = 0; rank < Rank.values().length; rank++) {
//				Card newCard = new Card(Suit.values()[suit], Rank.values()[rank]);		// two for loops, messy!!
//				deck.add(newCard);
//
//			}

		}

	}

	public int checkDeckSize() {
		int deckSize = deck.size();

		return deckSize;
	}

	public Card hit() {
		Card hit = deck.remove(0);

		return hit;
	}

	public List<Card> dealHand() {
		List<Card> hand = new ArrayList<>();
		hand.add(deck.remove(0));
		hand.add(deck.remove(0));
		
		return hand;

	}

	public List<Card> shuffleDeck() {

		Collections.shuffle(deck);

		return deck;

	}

	public List<Card> newDeck(List<Card> hand) {
		deck.addAll(hand);
		return deck;
	}

}
