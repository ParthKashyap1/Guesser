import java.util.Scanner;

class Guesser{
	/**
	* The number collected from the guesser.
	*/
	private int gnum;
	/**
	* This method collects the number from Guesser.
	*
	* @param low-The lowest permissible value.
	* @param high-The highest permissible value.
	* @return The number collected from the Guesser.
	*/
	int guessNum(int low,int high){
		System.out.println("Please guess a number between " +low+ " to " +high+);
		Scanner scan = new Scanner(System.in);
		gnum = scan.nextInt();
		if(gnum >= low && gnum <= high)
		{
			return gnum;
		}
		else
		{
			System.out.println("Please guess a number within the valid range");
			return guessNum(low,high);	
		}
	}
}
class Player{
	/**
	* The number predicted from the player.
	*/
	private int pnum;
	/**
	* This method collects the predicted number from players.
	* 
	* @param low-The lowest permissible value.
	* @param high-The highest permissible value.
	* @return The predicted value from player.
	*/
	int predictNum(int low,int high){
		System.out.println("Please predict a number between " +low+ " to " +high+);
		Scanner scan =  new Scanner(System.in);
		pnum = scan.nextInt();
		if(pnum >= low && pnum <= high)
		{
			return pnum;
		}
		else
		{
			System.out.println("Please predict a number within the valid range");
			return predictNum(low,high);
		}
	}
}
class Umpire{
	/** The number guessed by Guesser */
	private int numFromGuesser;
	/** The number predicted by PLayer 1. */
	private int numFromPlayer1;
	/** The number predicted by Player 2. */
	private int numFromPlayer2;
	/** The number predicted by Player 3. */
	private int numFromPlayer3;

	/**
	* This method collects the number guessed by Guesser and store it in numFromGuesser.
	* @see Guesser.
 	*/
	void collectNumFromGuesser(){
		Guesser g = new Guesser();
		numFromGuesser = g.guessNum(1,100);
	}

	/** 
	* This method collects the number from Players and store it in numFromPlayer1,numFromPlayer2,numFromPlayer3 respectively.
	* @see Player.
	*/
	void collectNumFromPlayers(){
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		
		numFromPlayer1=p1.predictNum(1,100);
		numFromPlayer2=p2.predictNum(1,100);
		numFromPlayer3=p3.predictNum(1,100);
	}
	
	/**
	* This method compares the guessed numbers given by guesser with the predicted numbers of players and also winner is announced,if any.
	*/
	void Compare(){
		if(numFromGuesser == numFromPlayer1)
		{
			System.out.println("Player 1 won");
		}
		if(numFromGuesser == numFromPlayer2)
		{
			System.out.println("Player 2 won");
		}
		if(numFromGuesser == numFromPlayer3)
		{
			System.out.println("Player 3 won");
		}
		else if(numberFromGuesser != numFromPlayer1 && numberFromGuesser != numberFromPlayer2)
		{
			System.out.println("Game lost!! Try again");
		}
	}
}

public class GameGuesserApp {
	/**
	* Repeats the game thrice.
	*/
	public static final int CHANCES = 3;
	/**
	* This is the main method which makes use of collectNumFromGuesser,collectNumFromPlayers,Compare methods.
	*
	* @param args unused.
	* @see guesser.
	* @see player.
	* @see umpire.
	*/
	public static void main(String[] args) {
		//Creates an umpire object.
		Umpire u = new Umpire();
		int i = 1;
		while(i <= CHANCES)
		{
			u.collectNumFromGuesser();
			u.collectNumFromPlayers();
			u.Compare();
			++i;
		}

	}

}
