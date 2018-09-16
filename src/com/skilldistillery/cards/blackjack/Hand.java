package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public abstract class Hand {
	List<Card> hand = new ArrayList<>();
	Deck deck = new Deck();
	Card card = new Card();
	public Hand () {}
	
	
	public int getHandValue(List<Card> cards) {
		int hand = 0;
		for (Card card : cards) {
			int c = card.getValue();
			hand += c;
			
			
		}
		System.out.println(hand);
		return hand;
	}
	
	public Card addCard() {
		Card nCard = deck.hit();
		
		return nCard;
	}
	
	public void clearHand() {
		hand.clear();
	}
	
	public List<Card> getCards( ) {
		
		return deck.dealHand();
	}
	
	@Override
	public String toString() {
		
		
		
		return toString();
	}
	
	

}
