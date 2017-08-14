package recipe;
//Mark Fan. CS 1A Lab 3
import java.util.Scanner;

public class recipe
{
	// food #1
	static final String FOOD_1_NAME = "Broccoli";
	static final int FOOD_1_CALORIES_P100G = 50;
	static final double FOOD_1_TOTAL_FAT_P100G = 0.5;
	
	// food #2
	static final String FOOD_2_NAME = "Potato";
	static final int FOOD_2_CALORIES_P100G = 163;
	static final double FOOD_2_TOTAL_FAT_P100G = 0.2;
	
	// food #3
	static final String FOOD_3_NAME = "Corn Flakes";
	static final int FOOD_3_CALORIES_P100G = 100;
	static final double FOOD_3_TOTAL_FAT_P100G = 0.1;
	// food #4
	static final String FOOD_4_NAME = "Strawberries";
	static final int FOOD_4_CALORIES_P100G = 75;
	static final double FOOD_4_TOTAL_FAT_P100G = 0;
	
	static final String INDENT = "   ";
	
	public static void main(String[] args)
	{
		// User-provided values.
		String recipeName, userInputStr, userServingsStr;
		int userInputInt, userServingsInt;
		double totalFat, totalCals, resultDub;
		
		// Declare an object that is used for console input.
		Scanner inputStream = new Scanner(System.in);
		
		// Initialized accumulator variables.
		totalCals = 0.;
		totalFat = 0.;
		
		// Print list of ingredients menu.
		System.out.println("------ List of Possible Ingredients ------");
		System.out.println(INDENT + "Food #1: " + FOOD_1_NAME);
		System.out.println(INDENT + "Food #2: " + FOOD_2_NAME);
		System.out.println(INDENT + "Food #3: " + FOOD_3_NAME);
		System.out.println(INDENT + "Food #4: " + FOOD_4_NAME);
		
		// Name of recipe and number of servings.
		System.out.print("\nGive a name of your recipe: ");
		recipeName = inputStream.nextLine();
		System.out.print("How many servings? ");
		userServingsStr = inputStream.nextLine();
		userServingsInt = Integer.parseInt(userServingsStr);
		
		// Error testing if the user enters either 0 or more than 15.
		if(userServingsInt < 0 || userServingsInt > 15)
		{
			System.out.println("ERROR. Cannot exceed either less than 0 or "
				+ "more than 15 servings");
			inputStream.close();
			return;
		}
		
		// Food #1 -------------------------------
		System.out.print("How many grams of " + FOOD_1_NAME + "? ");
		userInputStr = inputStream.nextLine();
		userInputInt = Integer.parseInt(userInputStr);
		
		// Error testing if the user prompts (in g) either < 0 or > 1500.
		if(userInputInt < 0 || userInputInt > 1500)
		{
			System.out.println("ERROR. Cannot exceed either less than 0 or "
				+ "more than 1500 grams.");
			inputStream.close();
			return;
		}
		
		// update accumulators for Food 1. 
		totalCals += userInputInt *
			userServingsInt * (FOOD_1_CALORIES_P100G / 100.);
		totalFat += userInputInt *
			userServingsInt * (FOOD_1_TOTAL_FAT_P100G / 100.);
		
		//Food #2 -------------------------------
		System.out.print("How many grams of " + FOOD_2_NAME + "? ");
		userInputStr = inputStream.nextLine();
		userInputInt = Integer.parseInt(userInputStr);
		
		//Error testing if the user prompts (in g) either < 0 or > 1500.
		if(userInputInt < 0 || userInputInt > 1500)
		{
			System.out.println("ERROR. Cannot exceed either less than 0 or "
				+ "more than 1500 grams.");
			inputStream.close();
			return;
		}
		
		// update accumulators for Food 2.
		totalCals += userInputInt *
			userServingsInt * (FOOD_2_CALORIES_P100G / 100.);
		totalFat += userInputInt *
			userServingsInt * (FOOD_2_TOTAL_FAT_P100G / 100.);
		
		// Food #3 -------------------------------
		System.out.print("How many grams of " + FOOD_3_NAME + "? ");
		userInputStr = inputStream.nextLine();
		userInputInt = Integer.parseInt(userInputStr);
		
		// Error testing if the user prompts (in g) either < 0 or > 1500.
		if(userInputInt < 0 || userInputInt > 1500)
		{
			System.out.println("ERROR. Cannot exceed either less than 0 or "
				+ "more than 1500 grams.");
			inputStream.close();
			return;
		}
				
		// update accumulators for Food 3.
		totalCals += userInputInt *
			userServingsInt * (FOOD_3_CALORIES_P100G / 100.);
		totalFat += userInputInt *
			userServingsInt * (FOOD_3_TOTAL_FAT_P100G / 100.);
		
		// Food #4 -------------------------------
		System.out.print("How many grams of " + FOOD_4_NAME + "? ");
		userInputStr = inputStream.nextLine();
		userInputInt = Integer.parseInt(userInputStr);
		
		// Error testing if the user prompts (in g) either < 0 or > 1500.
		if(userInputInt < 0 || userInputInt > 1500)
		{
			System.out.println("ERROR. Cannot exceed either less than 0 or "
				+ "more than 1500 grams.");
			inputStream.close();
			return;
		}
		
		// update accumulators for Food 4.
		totalCals += userInputInt *
			userServingsInt * (FOOD_4_CALORIES_P100G / 100.);
		totalFat += userInputInt *
			userServingsInt * (FOOD_4_TOTAL_FAT_P100G / 100.);
		inputStream.close(); //This would stop compiler warning. 
		
		// Report Results ------------------------------------------
		System.out.println("\n------ Nutrition for " + recipeName + " ------");
		resultDub = totalCals / userServingsInt;
		System.out.println(INDENT + "Calories: " + resultDub);
		resultDub = totalFat / userServingsInt;
		System.out.println(INDENT + "Total Fat: " + resultDub + " grams");
	}
}
