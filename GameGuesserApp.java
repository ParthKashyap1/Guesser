package com.abc.Tech;
import java.util.Scanner;

class Guesser
{
	int gnum;
	int guessNum()
	{
		System.out.println("Please guess a number between 1 to 100");
		Scanner scan = new Scanner(System.in);
		gnum = scan.nextInt();
		return gnum;
	}
}
class Player
{
	int pnum;
	int predictNum()
	{
		System.out.println("Please predict a number between 1 to 100");
		Scanner scan =  new Scanner(System.in);
		pnum = scan.nextInt();
		return pnum;
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
		numFromGuesser = g.guessNum();
	}
	
	void collectNumFromPlayers()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		
		numFromPlayer1=p1.predictNum();
		numFromPlayer2=p2.predictNum();
		numFromPlayer3=p3.predictNum();
	}
	
	void Compare()
	{
		if(numFromGuesser == numFromPlayer1)
		{
			System.out.println("Player 1 won");
		}
		else if(numFromGuesser == numFromPlayer2)
		{
			System.out.println("Player 2 won");
		}
		else if(numFromGuesser == numFromPlayer3)
		{
			System.out.println("Player 3 won");
		}
		else
		{
			System.out.println("Game lost!! Try again");
		}
	}
}

class GameGuesserApp {

	public static void main(String[] args) 
	{
		Umpire u = new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayers();
		u.Compare();

	}

}
