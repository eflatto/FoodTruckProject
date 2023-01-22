package com.skilldistillery.foodtruck.entities;

//import com.skilldistillery.foodtruck.app.FoodTruckApp;

public class Foodtruck {

	private static int nextTruckId =100;
	private int id ;
	private double rating;
	private String name;
	private String foodType;
	
		
	
	public Foodtruck() {
		this.id = nextTruckId;
		nextTruckId++;
		
	}
	
	
	public Foodtruck(String name,String foodType,int rating) {
		this.name = name;
		this.foodType = foodType;
		this.rating = rating;
		this.id=nextTruckId;
		nextTruckId++;
		
	}
	
	
	
	public double getRating() {
		return this.rating;
	}
	public void setRating(double rating) {
		this.rating= rating;
	}


	@Override
	public String toString() {
		return "\nFoodtruck [id=" + id + ", rating=" + rating + ", name=" + name + ", foodType=" + foodType + "]"+"\n";
		
	}

	
	
	
	
	
	
}
