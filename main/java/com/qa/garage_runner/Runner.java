package com.qa.garage_runner;

import garageTask.*;

public class Runner {

	public static void main(String[] args) {
		Car ford = new Car("Ford", "Fiesta", 5000);
		Car vw = new Car("VW", "Golf", 4500);
		Car bmw = new Car("BMW", "3 Series", 9000);
		Boat titanic = new Boat("Titanic", 1000000);
		
		Garage garage = new Garage();
		
		garage.addVehicle(ford);
		garage.addVehicle(bmw);
		garage.addVehicle(vw);
		garage.addVehicle(titanic);
		
		garage.showGarageContents();
		
		garage.removeById(4);
		//garage.removeByType("Car");
		
		garage.showGarageContents();
		
		garage.fix();

	}

}
