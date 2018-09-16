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
		playersTurn();
		
		
		
		
		
	}
	
	public void playersTurn () {
		DealerHand dh = new DealerHand();
		
		Scanner kb = new Scanner(System.in);
		dh.shuffle();
		List<Card> pHand = new ArrayList<>(dh.getCards());
		List<Card> dHand = new ArrayList<>(dh.getCards());
		dh.size(); 
		System.out.println(pHand);
		System.out.println(dHand);
		
		
		
		
		
		
	}

}
