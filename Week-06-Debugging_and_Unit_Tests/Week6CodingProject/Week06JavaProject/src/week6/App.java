package week6;

public class App {

	public static void main(String[] args) {
		
		//Create and Shuffle deck.
		Deck deck = new Deck();
		System.out.println("A new deck has been created.");
		System.out.println("--------------------");
		deck.describe();
		System.out.println("--------------------");
		System.out.println("Deck has been shuffled!!");
		System.out.println("--------------------");
		deck.shuffle();
		deck.describe();
		
		
		//Create players
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");
		
		//Deal cards to players
		for (int i = 1; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		}
		System.out.println("--------------------");
		//Flip cards to play the game.
		for (int i = 1; i < 26; i++) {
			Card card1 = player1.flip();
			Card card2 = player2.flip();
			System.out.println("Player 1 card: " + card1.getName());
			System.out.println("Player 2 card: " + card2.getName());
			
			if (card1.getValue() > card2.getValue()) {
				player1.incrementScore();
				System.out.println("Player 1 wins!!");
			} else if (card1.getValue() < card2.getValue()){				
					player2.incrementScore();
					System.out.println("Player 2 wins!!");
				} else if (card1.getValue() == card2.getValue()) {
					System.out.println("It was a draw!! Play again!!");
				}
			}
		System.out.println("--------------------");
		System.out.println("Player 1 score: " + player1.getScore());
		System.out.println("Player 2 score: " + player2.getScore());
		System.out.println("--------------------");
		if (player1.getScore() > player2.getScore()) {
			System.out.println("Player 1 is the winner!!");
		} else {
			System.out.println("Player 2 is the winner!!");
		}
		
		
		}
		
		

	}


