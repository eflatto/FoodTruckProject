package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.Foodtruck;

public class FoodTruckApp {
	// This main foodtruck does not pass in ID value for any foodtruck

	// fllet o foodtruck
	private Foodtruck[] fleet;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			FoodTruckApp fta = new FoodTruckApp(); 
	
			Scanner sc = new Scanner(System.in);
			fta.fleet = new Foodtruck [5];
			boolean keepGoing = true;
			

		
		do {
			
			System.out.println("Please enter the name, food type, and rating of up to 5 food trucks: ");
			
			for (int i = 0; i < 5; i++) {
				System.out.print("Food Truck Name:");
				String name = sc.next();
				if (name.equalsIgnoreCase("quit")) {
					System.out.print("goodbye");
					keepGoing = false;
					break;	
				}
				System.out.print("Food Type:");
				String foodType = sc.next();
				System.out.print("Rating:");
				int rating = sc.nextInt();
				
				

				fta.fleet[i] = new Foodtruck(name, foodType, rating);

				System.out.println(fta.fleet[i]);

			}

		} while (keepGoing);

	}

}
