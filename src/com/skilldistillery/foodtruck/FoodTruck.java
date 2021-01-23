package com.skilldistillery.foodtruck;

public class FoodTruck {

	private int numID;
	private String truckName;
	private String FoodType;
	private int starRating;
	
	
	public FoodTruck() {}
	
	public FoodTruck(int numID, String truckName, String foodType, int starRating) {
		this.numID = numID;
		this.truckName = truckName;
		this.FoodType = foodType;
		this.starRating = starRating;
	}
	
	public String toString() {
		String output = "Truck ID: " + numID + ", Truck Name: " + truckName + ", Food Type: " + FoodType + ", Star Rating: " + starRating;
		return output;
	}

	public void displayTruck() {
		String truckData = this.toString();
		System.out.println(truckData);
	}

	public int getNumID() {
		return numID;
	}

	public void setNumID(int numID) {
		this.numID = numID;
	}

	public String getTruckName() {
		return truckName;
	}

	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}

	public String getFoodType() {
		return FoodType;
	}

	public void setFoodType(String foodType) {
		FoodType = foodType;
	}

	public int getStarRating() {
		return starRating;
	}

	public void setStarRating(int starRating) {
		this.starRating = starRating;
	}
	
	
	
	
	
	
	
	
	
	
	
}
