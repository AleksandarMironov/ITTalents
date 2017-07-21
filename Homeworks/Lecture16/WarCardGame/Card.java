package WarCardGame;

public class Card {
	final int power;
	private String suit; 
	private String rank; 
	
	public Card(String rank, String suit, int power){
		if (power >= 0){
			this.power = power;
		} else {
			this.power = -1;
		}		
		this.suit = suit;
		this.rank = rank;
	}
	
	public String toString(){
		return "\n ----- \n| ".concat(rank).concat(suit).concat(" |\n ----- ");
	}
}

//♧ 
//♢ 
//♡ 
//♠