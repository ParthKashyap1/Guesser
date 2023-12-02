import java.util.Scanner;

class Guesser
{
	int gnum;
	int guessNum(int low,int high)
	{
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
class Player
{
	int pnum;
	int predictNum(int low,int high)
	{
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
class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser()
	{
		Guesser g = new Guesser();
		numFromGuesser = g.guessNum(1,100);
	}
	
	void collectNumFromPlayers()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		
		numFromPlayer1=p1.predictNum(1,100);
		numFromPlayer2=p2.predictNum(1,100);
		numFromPlayer3=p3.predictNum(1,100);
	}
	
	void Compare()
	{
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

class GameGuesserApp 
{
	final static int CHANCES = 3;
	public static void main(String[] args) 
	{
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
