package week6;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private int score;
	private String name;
	private List<Card> hand;
	
	
	public Player(String name) {
		
		this.hand = new ArrayList<>();
		this.name = name;
		this.score = 0;
	}
	
	public void describe() {
		System.out.println("--------------------");
		System.out.println("Player: " + this.name);
		System.out.println("This is your hand: " + this.hand);
		System.out.println("--------------------");
			for (Card card : hand) {
				card.describe();
			}
	}
	
	public Card flip() {
		
		return hand.remove(0);
	}
	
	public void draw(Deck deck) {
		
		hand.add(deck.draw());
	}
	
	public void incrementScore() {
		
		score++;
	}
	
	public int getScore() {
		
		return score;
	}
}
