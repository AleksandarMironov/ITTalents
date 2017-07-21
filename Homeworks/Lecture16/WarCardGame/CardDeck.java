package WarCardGame;

public class CardDeck {
	private static Card [] deck = {new Card("2", " ♣", 2), new Card("2", " ♢", 2), new Card("2", " ♡", 2), new Card("2", " ♠", 2), // to do, add cards
						new Card("3", " ♣", 3), new Card("3", " ♢", 3), new Card("3", " ♡", 3), new Card("3", " ♠", 3),
						new Card("4", " ♣", 4), new Card("4", " ♢", 4), new Card("4", " ♡", 4), new Card("4", " ♠", 4),
						new Card("5", " ♣", 5), new Card("5", " ♢", 5), new Card("5", " ♡", 5), new Card("5", " ♠", 5),
						new Card("6", " ♣", 6), new Card("6", " ♢", 6), new Card("6", " ♡", 6), new Card("6", " ♠", 6),
						new Card("7", " ♣", 7), new Card("7", " ♢", 7), new Card("7", " ♡", 7), new Card("7", " ♠", 7),
						new Card("8", " ♣", 8), new Card("8", " ♢", 8), new Card("8", " ♡", 8), new Card("8", " ♠", 8),
						new Card("9", " ♣", 9), new Card("9", " ♢", 9), new Card("9", " ♡", 9), new Card("9", " ♠", 9),
						new Card("10", " ♣", 10), new Card("10", " ♢", 10), new Card("10", " ♡", 10), new Card("10", " ♠", 10),
						new Card("J", " ♣ ", 11), new Card("J", " ♢", 11), new Card("J", " ♡", 11), new Card("J", " ♠", 11),
						new Card("Q", " ♣ ", 12), new Card("Q", " ♢", 12), new Card("Q", " ♡", 12), new Card("Q", " ♠", 12),
						new Card("K", " ♣ ", 13), new Card("K", " ♢", 13), new Card("K", " ♡", 13), new Card("K", " ♠", 13),
						new Card("A", " ♣ ", 14), new Card("A", " ♢", 14), new Card("A", " ♡", 14), new Card("A", " ♠", 14)};
	
	public static Card [] giveMeFreshDeck(){
		return CardDeck.deck.clone();
	}
}
