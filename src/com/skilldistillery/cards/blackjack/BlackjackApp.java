package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.cards.common.Card;

public class BlackjackApp {
	DealerHand dh = new DealerHand();
	Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		BlackjackApp bja = new BlackjackApp();
		bja.run();
	}

	public void run() {
		System.out.println("Welcome to Blackjack");
		dh.shuffle();
		System.out.println("Ready to play? Y or N ");
		String input = kb.next().toUpperCase();
		while (input.equals("Y")) {
			playBJ();
			System.out.println("Play again? Y or N ");
			input = kb.next().toUpperCase();
			System.out.println("Cards left in deck " + dh.size());
			if ( dh.size() < 15 ) {
				System.out.println("Look at the time, its my break");
				System.out.println("Have a good day!");
				return;
			}
		}
		kb.close();
	}

	public void playBJ() {

		List<Card> pHand = new ArrayList<>(dh.getCards()); // starting hands
		List<Card> dHand = new ArrayList<>();
		dHand.add(dh.deck.hit());
		System.out.println("Your hand: " + pHand);
		System.out.println("Dealer is showing: " + dHand);
		dHand.add(dh.deck.hit());
		int pHandValue = dh.getPlayerHand(pHand);
		int dHandValue;
		if (pHandValue == 21) {
			playerBlackjack();
			return;
		}

		System.out.println("Would you like to hit or stay?");
		String input = kb.next();

		while (input.equals("hit")) {
			pHand.add(dh.deck.hit());
			pHandValue = dh.getPlayerHand(pHand);
			if (pHandValue == 21) {
				playerBlackjack();
				return;
			} else if (pHandValue > 21) {
				playerBust();
				return;
			}
			System.out.println("Your hand: " + pHand);
			System.out.println("Would you like to hit or stay?");
			input = kb.next();
		}
		System.out.println("Dealer is showing: " + dHand);
		dHandValue = dh.getDealerHand(dHand);
		if (dHandValue == 21) {
			dealerBlackjack();
			return;
		}

		while (dHandValue < 17 || pHandValue > dHandValue) {
			if (pHandValue == dHandValue) {
				push();
				return;
			} else {
				dHand.add(dh.deck.hit());
				System.out.println("Dealer hits");
				System.out.println("Dealer is showing: " + dHand);
				dHandValue = dh.getDealerHand(dHand);
				if (dHandValue > 21) {
					dealerBust();
					return;
				} else if (dHandValue == 21) {
					dealerBlackjack();
					return;
				}
			}
		}

		if (pHandValue > dHandValue) {
			pHandValue = dh.getPlayerHand(pHand);
			// dHandValue = dh.getDealerHand( dHand );
			playerWins();
			return;
		} else if (pHandValue < dHandValue) {
			pHandValue = dh.getPlayerHand(pHand);
			// dHandValue = dh.getDealerHand( dHand );
			dealerWins();
			return;
		} else {
			push();
			return;
		}

	}

	public void playerBlackjack() {

		System.out.println("*************");
		System.out.println("***Player****");
		System.out.println("*****got*****");
		System.out.println("**Blackjack**");
		System.out.println("*************");
		// System.exit(0);

	}

	public void dealerBlackjack() {

		System.out.println("*************");
		System.out.println("****Dealer***");
		System.out.println("*****got*****");
		System.out.println("**Blackjack**");
		System.out.println("*************");
		// System.exit(0);

	}

	public void dealerBust() {

		System.out.println("**************");
		System.out.println("****Dealer****");
		System.out.println("**************");
		System.out.println("****Busted****");
		System.out.println("**************");
		// System.exit(0);
	}

	public void playerBust() {

		System.out.println("**************");
		System.out.println("****Player****");
		System.out.println("**************");
		System.out.println("****Busted****");
		System.out.println("**************");
		// System.exit(0);
	}

	public void playerWins() {

		System.out.println("**************");
		System.out.println("****Player****");
		System.out.println("**************");
		System.out.println("*****Wins*****");
		System.out.println("**************");
		// System.exit(0);
	}

	public void dealerWins() {

		System.out.println("**************");
		System.out.println("****Dealer****");
		System.out.println("**************");
		System.out.println("*****Wins*****");
		System.out.println("**************");
		// System.exit(0);
	}

	public void push() {
		System.out.println("**************");
		System.out.println("******No******");
		System.out.println("****Winner****");
		System.out.println("**************");
		System.out.println("*****PUSH*****");
		// System.exit(0);
	}

}
