package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class BlackjackApp {

	public static void main(String[] args) {
		BlackjackApp bja = new BlackjackApp();
		bja.run();
	}
	
	public void run() {
		PlayerHand ph = new PlayerHand();
		Deck deck = new Deck();
		Card card = new Card();
		
		deck.shuffleDeck();
		List<Card> playerHand = new ArrayList<>( ph.getCards());
		System.out.println(playerHand.toString()); // prints player hand
		ph.getHandValue(playerHand); // gets value of hand
		playerHand.add( ph.addCard() ); //adds card to players hand
		System.out.println(playerHand.toString());
		
		
	}

}
