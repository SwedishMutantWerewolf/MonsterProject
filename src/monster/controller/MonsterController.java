package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;

public class MonsterController 
{
	public void start ()
	{
		MarshmallowMonster sample = new MarshmallowMonster();
		System.out.println(sample);
		MarshmallowMonster realMonster = new MarshmallowMonster("Vice", 3, 5, 5, true);
		
		System.out.println(realMonster);
		System.out.println("Vice is so hungry he is going to eat a tentacle!");
		realMonster.setTentacleAmount(4);
		System.out.println(realMonster);
		System.out.println("Vice is so hungry he is going to eat another tentacle and two legs!");
		realMonster.setTentacleAmount(3);
		realMonster.setArmCount(3);
		interactWithTheMonster(realMonster);
	}
	private void interactWithTheMonster(MarshmallowMonster currentMonster)
	{
		System.out.println(currentMonster.getName() + " wants to know what to eat next.");
		System.out.println(currentMonster.getName() + " suggests arms. They have " + currentMonster.getArmCount());
		System.out.println("How many do you want to eat?");
		Scanner myScanner = new Scanner(System.in);
		int consumed = myScanner.nextInt();
	
		if(consumed < 0)
		{
			System.out.println("You cannot eat a negative amount silly human!");
		}
		else if(consumed == 0)
		{
			System.out.println("Not that hungry are you?");
		
		}
		else if(consumed > currentMonster.getArmCount())
		{
			System.out.println("That is impossible! I only gave " + currentMonster.getArmCount() + " arms!");
		}
		else
		{
			currentMonster.setArmCount(currentMonster.getArmCount() - consumed);
			System.out.println("Thank you so much! I only have this many arms now: " + currentMonster.getArmCount());
		}
	}
}
