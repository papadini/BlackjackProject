package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public abstract class Hand {
	Deck deck = new Deck();
	
	public Hand () {}
	
	
	public abstract int getHandValue();
	
	public void addCard( Card c) {	
		deck.hit();
		
	}
	
	public void clearHand() {
		//hand.clear();
		
	}
	
	public List<Card> getCards( ) {
		List<Card> hand = new ArrayList<>();
		hand.add( deck.hit() );
		hand.add( deck.hit() );
		
		
	
		return hand;
	}
	
	@Override
	public String toString() {
		
		
		
		return toString();
	}
	
	
	

}
