package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.cards.common.Card;

public class BlackjackApp {

	public static void main(String[] args) {
		BlackjackApp bja = new BlackjackApp();
		bja.run();
	}

	public void run() {
		System.out.println("Welcome to Blackjack");
		playBJ();

	}

	public void playBJ() {
		DealerHand dh = new DealerHand();
		Scanner kb = new Scanner(System.in);
		dh.shuffle();
		List<Card> pHand = new ArrayList<>(dh.getCards()); // starting hands
		List<Card> dHand = new ArrayList<>();
		dHand.add(dh.deck.hit());
		System.out.println("Your hand: " + pHand);
		System.out.println("Dealer is showing: " + dHand);
		dHand.add(dh.deck.hit());
		dh.size();
		int pHandValue = dh.getPlayerHand(pHand);
		int dHandValue;
		if (pHandValue == 21) {
			playerBlackjack();
		}

		System.out.println("Would you like to hit or stay?");
		String input = kb.next();

		while (input.equals("hit")) {
			pHand.add(dh.deck.hit());
			pHandValue = dh.getPlayerHand(pHand);
			dh.size();
			if (pHandValue == 21) {
				playerBlackjack();
			} else if (pHandValue > 21) {
				playerBust();
			}
			System.out.println("Your hand: " + pHand);
			System.out.println("Would you like to hit or stay?");
			input = kb.next();
		}
		System.out.println("Dealer is showing: " + dHand);
		dHandValue = dh.getDealerHand(dHand);
		if (dHandValue == 21) {
			dealerBlackjack();
		}

		while (dHandValue < 17 || pHandValue > dHandValue) {
			dHand.add(dh.deck.hit());
			System.out.println("Dealer hits");
			System.out.println("Dealer is showing: " + dHand);
			dHandValue = dh.getDealerHand(dHand);
			if (dHandValue > 21) {
				dealerBust();
			} else if (dHandValue == 21) {
				dealerBlackjack();
			}
		}

		if (pHandValue > dHandValue) {
			pHandValue = dh.getPlayerHand(pHand);
			// dHandValue = dh.getDealerHand( dHand );
			playerWins();
		} else {
			pHandValue = dh.getPlayerHand(pHand);
			// dHandValue = dh.getDealerHand( dHand );
			dealerWins();
		}

		// pHand.add( dh.deck.hit() ); // add card to hand.
		// dh.getHandValue(pHand); // hand value
		kb.close();
	}

	public void playerBlackjack() {

		System.out.println("*************");
		System.out.println("***Player****");
		System.out.println("*****got*****");
		System.out.println("**Blackjack**");
		System.out.println("*************");
		System.exit(0);

	}

	public void dealerBlackjack() {

		System.out.println("*************");
		System.out.println("****Dealer***");
		System.out.println("*****got*****");
		System.out.println("**Blackjack**");
		System.out.println("*************");
		System.exit(0);

	}

	public void dealerBust() {

		System.out.println("**************");
		System.out.println("****Dealer****");
		System.out.println("**************");
		System.out.println("****Busted****");
		System.out.println("**************");
		System.exit(0);
	}

	public void playerBust() {

		System.out.println("**************");
		System.out.println("****Player****");
		System.out.println("**************");
		System.out.println("****Busted****");
		System.out.println("**************");
		System.exit(0);
	}

	public void playerWins() {

		System.out.println("**************");
		System.out.println("****Player****");
		System.out.println("**************");
		System.out.println("*****Wins*****");
		System.out.println("**************");
		System.exit(0);
	}

	public void dealerWins() {

		System.out.println("**************");
		System.out.println("****Dealer****");
		System.out.println("**************");
		System.out.println("*****Wins*****");
		System.out.println("**************");
		System.exit(0);
	}

}
