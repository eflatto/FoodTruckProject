package com.skilldistillery.foodtruck.app;

import java.util.Iterator;
import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.Foodtruck;

public class FoodTruckApp {

	private Foodtruck[] fleet;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodTruckApp foodTrucks = new FoodTruckApp();

		Scanner sc = new Scanner(System.in);

		foodTrucks.fleet = new Foodtruck[5];

		boolean keepGoing = true;

		do {
			System.out.println("Welcome to the Food Truck App!");
			System.out.println("Please enter the name, food type, and rating of up to 5 food trucks: ");

			for (int i = 0; i < 5; i++) {
				if (i == 4) {
					keepGoing = false;
				}
				System.out.print("Food Truck Name:");
				String name = sc.nextLine();
				if (name.equalsIgnoreCase("quit")) {

					keepGoing = false;
					break;
				}
				System.out.print("Food Type:");
				String foodType = sc.nextLine();
				System.out.print("Rating:");
				int rating = sc.nextInt();

				foodTrucks.fleet[i] = new Foodtruck(name, foodType, rating);

				System.out.println(foodTrucks.fleet[i]);
				sc.nextLine();

			}

		} while (keepGoing);

		boolean keepGoing1 = true;

		do {
			foodTrucks.menu(sc, foodTrucks);
		} while (keepGoing1);

	}

	private void menu(Scanner sc, FoodTruckApp foodTrucks) {
		System.out.println("Please select an option: (1-4)");
		System.out.println("1. List all existing food trucks.");
		System.out.println("2. See the average rating of food trucks.");
		System.out.println("3. Display the highest-rated food truck.");
		System.out.println("4. Quit the program.");
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

	private void listFoodtrucks(FoodTruckApp foodTrucks) {
		System.out.println("Listing all food trucks");
		for (int i = 0; i < foodTrucks.fleet.length; i++) {
			if (foodTrucks.fleet[i] != null) {
				System.out.println(foodTrucks.fleet[i]);

			}
		}
	}

	private double averageRating(FoodTruckApp foodTrucks) {
		double sum = 0;
		for (int i = 0; i < fleet.length; i++) {
			sum += foodTrucks.fleet[i].getRating();
		}

		double average = (double)(sum / fleet.length);

		return average;
	}

	private Foodtruck highestRatedTruck(FoodTruckApp foodTrucks) {
		
	    Foodtruck topTruck = foodTrucks.fleet[0];
	    for(int i =0;i<fleet.length;i++) {
	    	if(foodTrucks.fleet[i].getRating()>topTruck.getRating()) {
	    		topTruck = foodTrucks.fleet[i];
	    		
	    	}
	    }
	    
	   
	    
	    return topTruck;
	}
}
