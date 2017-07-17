package WarCardGame;

import java.util.ArrayList;
import java.util.Stack;

public class Player {
	private String name;
	private Stack <Card> startCards = new Stack<>(); 
	private ArrayList <Card> wonCards = new ArrayList<>(); 
	
	public Player (String name){
		if (name.isEmpty()){
			System.out.println("Player can not be anonimous! Now player name is Vetrosvir"); //exception hire will be better 
			this.name = "Vetrosvir";
		} else {
			this.name = name;
		}
	}
	
	public String getName(){
		return this.name;
	}
	
	public void wonHand (Card ...cards){
		for(Card c : cards){
			this.wonCards.add(c);
		}
	}
	
	public int howManyCardsYouWon (){
		return this.wonCards.size();
	}
	
	public Card giveCard (){
		Card c = this.startCards.pop();
		return c;
	}
	
	public void getCard (Card c){
		if(this.startCards.size() <= 26){
			this.startCards.add(c);
		} else {
			System.out.println("To many cards in player " + this.name);
		}
	}
	
	public boolean haveCards(){
		if(this.startCards.size() > 0){
			return true;
		}
		
		return false;
	}
}
