package aplication;

import farming.PlantSpecie;

public class Ui {
	public static void printFarm(PlantSpecie[][] plants) {
		for (int i=0; i<plants.length; i++) {
			for (int j=0; j<plants.length; j++) {
				printPlant(plants[i][j]);
			}
			System.out.println();
		}
		
	}

	private static void printPlant(PlantSpecie plant) {
		if (plant == null) {
			System.out.print("-");
		} 
		else {
			System.out.print(plant);
		}
		System.out.print(" ");
	}
}
