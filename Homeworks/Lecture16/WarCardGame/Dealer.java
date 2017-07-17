package WarCardGame;

import java.util.Random;

public class Dealer {
	
	public static void deal(Player a, Player b){
		Card [] deck = CardDeck.giveMeFreshDeck();
		if(deck.length == 52){
			Random rnd = new Random();
			for (int i = 0; i < 26; i++){				
				int index = Math.abs(rnd.nextInt()) % 52;
				while (deck[index] == null){
					index = (index + 1) % 52;
				}
				a.getCard(deck[index]);
				deck[index] = null;
			}
			for (int i = 0; i < 26; i++){				
				int index = Math.abs(rnd.nextInt()) % 52;
				while (deck[index] == null){
					index = (index + 1) % 52;
				}
				b.getCard(deck[index]);
				deck[index] = null;
			}
		} else {
			System.out.println("Wrong deck! Give me another deck");
		}
	}
}
