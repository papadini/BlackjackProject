package com.skilldistillery.cards.blackjack;

import java.util.List;

import com.skilldistillery.cards.common.Card;

public class DealerHand extends Hand{


public DealerHand () {
	
}


@Override
public int getHandValue() {
	
	
	
	
	return 0;
}

public void shuffle() {
	deck.shuffleDeck();
}
public int size() {
	return deck.checkDeckSize();
}
	

}

