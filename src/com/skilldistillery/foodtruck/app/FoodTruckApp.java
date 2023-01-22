package com.skilldistillery.foodtruck.app;

import java.util.Iterator;
import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.Foodtruck;

public class FoodTruckApp {
	// Array to store the food truck objects
	private Foodtruck[] fleet;

	public static void main(String[] args) {
		
		// Initialize FoodTruckApp object and Scanner for user input
		FoodTruckApp foodTrucks = new FoodTruckApp();
		Scanner sc = new Scanner(System.in);
		
		// Initialize the fleet array with a size of 5
		foodTrucks.fleet = new Foodtruck[5];

		// Loop to allow user to input up to 5 food trucks
		boolean keepGoing = true;

		do {
			System.out.println("Welcome to the Food Truck App!");
			System.out.println("Please enter the name, food type, and rating of up to 5 food trucks: ");
			System.out.println("Type in Quit for a name if you wish to move on to the menu");

			for (int i = 0; i < 5; i++) {
				// Set keepGoing to false when all 5 trucks have been entered
				if (i == 4) {
					keepGoing = false;
				}
				System.out.println();
				System.out.print("Food Truck Name:");
				String name = sc.nextLine();
				// Exit loop when user enters "Quit" for name
				if (name.trim().equalsIgnoreCase("Quit")) {

					keepGoing = false;
					break;
				}
				System.out.println();
				System.out.print("Food Type:");
				String foodType = sc.nextLine();
				System.out.println();
				System.out.print("Rating: (1-5) ");
				
				int rating = sc.nextInt();
				sc.nextLine();
				// check that rating is between 1 and 5 
				//if the rating is out of bounds continue to the next iteration without adding to array
				if (rating < 1 || rating > 5) {
				    System.out.println("Error: Rating must be between 1 and 5.");
				    continue;
				}
				
				
				// Create new Foodtruck object with user inputted information and store in fleet array
				foodTrucks.fleet[i] = new Foodtruck(name, foodType, rating);

				System.out.print("\nTruck Entered: "+foodTrucks.fleet[i]);
				

			}

		} while (keepGoing);

		boolean keepGoing1 = true;
		
		 // do-While Loop to display menu and allow user to select options
		do {
			foodTrucks.menu(sc, foodTrucks);
		} while (keepGoing1);

	}
	// Method to display menu options and call corresponding methods
	private void menu(Scanner sc, FoodTruckApp foodTrucks) {
		System.out.println("Please select an option: (1-4)\n");
		System.out.println("1. List all existing food trucks.\n");
		System.out.println("2. See the average rating of food trucks.\n");
		System.out.println("3. Display the highest-rated food truck.\n");
		System.out.println("4. Quit the program.\n");
		System.out.println();
		int option = sc.nextInt();

		switch (option) {
		case 1:
			foodTrucks.listFoodtrucks(foodTrucks);
			break;
		case 2:
			System.out.println(foodTrucks.averageRating(foodTrucks));
			break;
		case 3:
			System.out.println(foodTrucks.highestRatedTruck(foodTrucks));
			break;
		case 4:
			System.out.println("Goodbye!");
			System.exit(0);
		}
	}

	// Method to display all food trucks in fleet
	private void listFoodtrucks(FoodTruckApp foodTrucks) {
		System.out.println("Listing all food trucks");
		for (int i = 0; i < foodTrucks.fleet.length; i++) {
			// Check if food truck object exists at current index and print it out
			if (foodTrucks.fleet[i] != null) {
				System.out.print(foodTrucks.fleet[i]);

			}
		}
	}
	// Method to calculate and return average rating of food trucks
	private double averageRating(FoodTruckApp foodTrucks) {
		double sum = 0;
		int length=foodTrucks.fleet.length;
		for (int i = 0; i < fleet.length; i++) {
			// Check if food truck object exists at current index
			if(fleet[i]!= null)
			sum += foodTrucks.fleet[i].getRating();
			else {
				
				length--;
			}
		}

		double average = (double)(sum / length);

		return average;
	}
	 // Method to find and return highest-rated food truck
	private Foodtruck highestRatedTruck(FoodTruckApp foodTrucks) {
		
	    Foodtruck topTruck = foodTrucks.fleet[0];
	    for(int i =0;i<fleet.length;i++) {
	    	if(fleet[i]!= null)
	    	if(foodTrucks.fleet[i].getRating()>topTruck.getRating()) {
	    		topTruck = foodTrucks.fleet[i];
	    		
	    	}
	    }
	    
	   
	    
	    return topTruck;
	}
}