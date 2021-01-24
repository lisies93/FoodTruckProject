
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

		// prompt the user to enter up to 5 food trucks
		for (int i = 0; i < ftArr.length; i++) {

			FoodTruck ft = new FoodTruck(i + 1, null, null, 0);

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
				ft.setTruckName(truckName);
				System.out.println();
				System.out.print("What's the food type?");
				String truckFoodType = kb.nextLine();
				ft.setFoodType(truckFoodType);
				System.out.println();
				System.out.print("What's the star rate between 1-5 ?");
				int starRating = kb.nextInt();
				kb.nextLine();
				ft.setStarRating(starRating);

				System.out.println();
				ftArr[i] = ft;
			}
		}
		return ftArr;
	}

	public void optionsMenu() {

		System.out.println("**********************************************");
		System.out.println("*                                            *");
		System.out.println("*           Please enter an option           *");
		System.out.println("*                                            *");
		System.out.println("**********************************************");
		System.out.println("*                                            *");
		System.out.println("*   1.List all existing food trucks.         *");
		System.out.println("*   2.See the average rating of food trucks. *");
		System.out.println("*   3.Display the highest-rated food truck.  *");
		System.out.println("*   4.Quit the program.                      *");
		System.out.println("*                                            *");
		System.out.println("**********************************************");

	}

	public void getTrucksInformation(FoodTruck[] trucks) {
		Scanner kb = new Scanner(System.in);
		FoodTruckApp fta = new FoodTruckApp();
		boolean option = true;

		for (int j = 0; j < trucks.length; j++) {
			if (trucks[j] != null) {
			}

			while (option) {
				fta.optionsMenu();
				int optionInputed = kb.nextInt();
				kb.nextLine();

				switch (optionInputed) {
				case 1:
					for (int i = 0; i < trucks.length; i++) {
						if (trucks[i] == null) {
							continue;
						}
						trucks[i].displayTruck();
					}
					break;
				case 2:
					System.out.println("The star rating average for the food trucks you entered is: " + fta.getRatingAv(trucks)+ " stars");
					break;
				case 3:
					
					int position = 0;
					
					double max = trucks[0].getStarRating();
					
					for (int i = 1; i < trucks.length; i++) {
						if(trucks[i] != null) {
						if (max < trucks[i].getStarRating()) {
							max = trucks[i].getStarRating();
							position = i;
						}
						} else if (trucks[i] == null) {
							continue;
						}
					}
					System.out.println("The highest rated food truck is: ");
					trucks[position].displayTruck();
					break;
				case 4: 
					System.out.println("Thanks for using FoodBack! Hope to see you soon!");
					option = false;
				
				}

			}

		}
	}

	public double getRatingAv(FoodTruck[] trucks) {
		double average= 0.0;
		double sum = 0;
		double counter = 0;
		for(int i = 0; i < trucks.length ; i++ ) {
			if(trucks[i] != null) {
				sum = sum + trucks[i].getStarRating();
				counter++;
			} else if (trucks[i] == null) {
				continue;
			}
		}
		average = sum / counter;
		return average;
	}
	

}
