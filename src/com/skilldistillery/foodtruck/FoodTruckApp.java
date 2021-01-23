package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {

		FoodTruckApp fta = new FoodTruckApp();
		// making a copy of the array
//		FoodTruck [] newTrucksEntered = new FoodTruck[fta.inputUser().length];
		fta.getTrucksInformation(fta.inputUser());
	}

	public FoodTruck[] inputUser() {

		Scanner kb = new Scanner(System.in);

		System.out.println("Welcome to FoodBack!");
		System.out.println("Enter up to 5 different food trucks");

		// creating a foodtruck array for my 5 objects
		FoodTruck[] ftArr = new FoodTruck[5];
		FoodTruck[] newFtArr = new FoodTruck[ftArr.length];
		int numTrucksEntered = 0;
		boolean enter = true;

		// prompt the user to enter up to 5 food trucks
		for (int i = 0; i < ftArr.length; i++) {
			if (enter) {
				System.out.println();
				System.out.print("Enter Food Truck #" + (i + 1));
				System.out.println();
				System.out.print("What's the name of the food truck?");
				String truckName = kb.nextLine();
				if (truckName.equals("quit") || truckName.equals("Quit") || truckName.equals("QUIT")) {
					if (i != 0) {
						break;
					} else {
						System.out.println("Please enter at least 1 truck ");
						i = i - 1;
						continue;
					}
				} else {
					System.out.println();
					System.out.print("What's the food type?");
					String truckFoodType = kb.nextLine();
					System.out.println();
					System.out.print("What's the star rate?");
					int starRating = kb.nextInt();
					kb.nextLine();
					System.out.println();
					numTrucksEntered = numTrucksEntered + 1;
					newFtArr[i] = ftArr[i] = new FoodTruck(i, truckName, truckFoodType, starRating);
				}
			}
		}
		FoodTruck[] trucksEntered = new FoodTruck[numTrucksEntered];
		for (int count = 0; count < trucksEntered.length; count++) {
			for (int i = 0; i < trucksEntered.length; i++) {
				trucksEntered[count] = newFtArr[i];
			}

		}
		return trucksEntered;
	}

	public void optionsMenu() {

		System.out.println("**********************************************");
		System.out.println("*           Please enter an option           *");
		System.out.println("**********************************************");
		System.out.println("*   1.List all existing food trucks.         *");
		System.out.println("*   2.See the average rating of food trucks. *");
		System.out.println("*   3.Display the highest-rated food truck.  *");
		System.out.println("*   4.Quit the program.                      *");
		System.out.println("**********************************************");

	}

	public void getTrucksInformation(FoodTruck[] trucks) {
		Scanner kb = new Scanner(System.in);
		FoodTruckApp fta = new FoodTruckApp();
		FoodTruck ft = new FoodTruck();
		boolean option = true;

		while (option) {
			fta.optionsMenu();
			int optionInputed = kb.nextInt();
			kb.nextLine();
			
			switch (optionInputed) {
			case 1: 
			for(int i = 0; i < trucks.length ; i++) {
				System.out.println(i);
				trucks[i].displayTruck();
				System.out.println(i);
					continue;
					}
            break;
			}

		
	}

}
}