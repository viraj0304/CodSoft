package codesoft;

import java.util.Random;
import java.util.Scanner;

public class CodSoftTask1 
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);

		Random random = new Random ();

		int lowbound = 1 ;
		int upbound = 100 ;
		int maximumattempts = 5 ;
		int round = 0 ;
		int score = 0 ;
		
		System.out.println("\n Hello Friends,This is Number Guessing Game");
		
		while(true) 
		{
			int targetNumber = random.nextInt(upbound - lowbound + 1) +lowbound ;
			int attempts = 0 ;
			
			System.out.println("\n Round " + (round + 1) + ":");
			System.out.println("\n You have chosen a number between " + lowbound +" and " + upbound +" and try to guess it.\n");
			
			while(attempts < maximumattempts) 
			{
				System.out.println("Your guess :");
				int userguess = s.nextInt();
				attempts++;
				
				if(userguess == targetNumber) 
				{
					System.out.println("Congraculations,You guessed the correct number in " + attempts + "attempts.\n");
					score++;
					break ;
				}

				else if(userguess < targetNumber) 
				{
					System.out.println("Your guess is too low,Try again \n");
				}
				
				else 
				{
					System.out.println("Your guess is too high,Try again.\n");
				}
				if (attempts == maximumattempts) 
				{
					System.out.println("Sorry , you are reached the maximum number of attempt . The correct number was : "+ targetNumber);
				}
				
			}
			System.out.println("\nDO you want to play coming round ? (Yes/No) :");
			String playAgain = s.next();
		    
			if(!playAgain.equalsIgnoreCase("Yes")) 
			{
				System.out.println("\n Thanks for playing,Your total score is : " + score + " out of " +(round + 1));
				break ;
			}
			round++;
			
		}
		s.close();		
	}

}