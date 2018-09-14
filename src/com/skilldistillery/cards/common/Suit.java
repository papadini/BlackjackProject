package com.skilldistillery.cards.common;

public enum Suit {
	HEARTS ("\u2764"), 
	SPADES ("\u2660"),
	CLUBS ("\u2663"),
	DIAMONDS ("\u2666");
	
	final private String name;
	
	Suit(String suit) {
		name = suit;
	}
	
	@Override
	public String toString () {
		return name;
	}

	
	
	
	
	
}
