package WarCardGame;

import java.util.ArrayList;
import java.util.Scanner;

public class WarGameStart {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first player name:");
		String tempPlayerName = sc.nextLine().trim();
		Player firstPlayer = new Player(tempPlayerName);
		
		System.out.println("\nEnter second player name:");
		tempPlayerName = sc.nextLine().trim();
		Player secondPlayer = new Player(tempPlayerName);
		
		Dealer.deal(firstPlayer, secondPlayer);
		
		while(firstPlayer.haveCards() && secondPlayer.haveCards()){		
			Card firstPlayerCard = firstPlayer.giveCard();
			System.out.println("Player: " + firstPlayer.getName() + firstPlayerCard);
			Card secondPlayerCard = secondPlayer.giveCard();
			System.out.println("Player: " + secondPlayer.getName() + secondPlayerCard);
			
			if(firstPlayerCard.power > secondPlayerCard.power){
				firstPlayer.wonHand(firstPlayerCard, secondPlayerCard);
				System.out.println("Player " + firstPlayer.getName() + " WON!!!");
				
			} else if(firstPlayerCard.power < secondPlayerCard.power){
				secondPlayer.wonHand(firstPlayerCard, secondPlayerCard);
				System.out.println("Player " + secondPlayer.getName() + " WON!!!");
				
			} else {
				ArrayList<Card> hand = new ArrayList<>();
				hand.add(firstPlayerCard);
				hand.add(secondPlayerCard);
				do{
					System.out.println("WAR!!!!");
					
					if(firstPlayer.haveCards()){
						System.out.println("Player: " + firstPlayer.getName());					
						firstPlayerCard = firstPlayer.giveCard();
						System.out.println(firstPlayerCard);
						hand.add(firstPlayerCard);
					}
					
					if(firstPlayer.haveCards()){					
						firstPlayerCard = firstPlayer.giveCard();
						System.out.println(firstPlayerCard);
						hand.add(firstPlayerCard);
					}
					
					if(firstPlayer.haveCards()){
						firstPlayerCard = firstPlayer.giveCard();
						System.out.println(firstPlayerCard);
						hand.add(firstPlayerCard);
					}
					
					System.out.println();
					
					if(secondPlayer.haveCards()){
						System.out.println("Player: " + secondPlayer.getName());					
						secondPlayerCard = secondPlayer.giveCard();
						System.out.println(secondPlayerCard);
						hand.add(secondPlayerCard);
					}
					
					if(secondPlayer.haveCards()){
						secondPlayerCard = secondPlayer.giveCard();
						System.out.println(secondPlayerCard);
						hand.add(secondPlayerCard);
					}
					
					if(secondPlayer.haveCards()){
						secondPlayerCard = secondPlayer.giveCard();
						System.out.println(secondPlayerCard);
						hand.add(secondPlayerCard);
					}
					
				} while (firstPlayerCard.power == secondPlayerCard.power);
				
				if(firstPlayerCard.power > secondPlayerCard.power){
					firstPlayer.wonHand(hand.toArray(new Card[hand.size()]));
					System.out.println("Player " + firstPlayer.getName() + " WON!!!");
					
				} else {
					secondPlayer.wonHand(hand.toArray(new Card[hand.size()]));
					System.out.println("Player " + secondPlayer.getName() + " WON!!!");
					
				}
			}
			
			System.out.println("\nPress ENTER to contenue!\n");

			String cantTinkBetterWay = sc.nextLine(); //KeyEvent will be better but!?
		}
		
		if(firstPlayer.howManyCardsYouWon() > secondPlayer.howManyCardsYouWon()){
			System.out.println("Player " + firstPlayer.getName() + " WON THE GAME!!!");
		} else {
			System.out.println("Player " + secondPlayer.getName() + " WON THE GAME!!!");
		}
		
		sc.close();
	}
}
