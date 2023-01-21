package com.skilldistillery.foodtruck.entities;

public class Foodtruck {

	private static int nextTruckId =100;
	private int id ;
	private int rating;
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
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Foodtruck [id=" + id + ", rating=" + rating + ", name=" + name + ", foodType=" + foodType + "]";
	}

	
	
	
	
	
	
}
