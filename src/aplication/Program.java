package aplication;

import farming.Farm;

public class Program {

	public static void main(String[] args) {
		
		Farm farm = new Farm();
		Ui.printFarm(farm.getPlants());

	}

}
