package garageTask;

import java.util.ArrayList;

public class Garage {
	// ==========================================
	// ATTRIBUTES
	// ==========================================
	protected ArrayList<Vehicle> garage;

	// ==========================================
	// CONSTUCTORS
	// ==========================================
	public Garage() {
		this.garage = new ArrayList<Vehicle>();
	}

	// ==========================================
	// METHODS
	// ==========================================
	public void addVehicle(Vehicle x) {
		this.garage.add(x);
	}

	public void removeById(int id) {
		boolean hasRemoved = false;
		for(int i = 0; i < this.garage.size(); i++ ) {
			if (this.garage.get(i).getId() == id) {
				this.garage.remove(i);
				hasRemoved = true;
				break;
			}
		}
		if(!hasRemoved) {
			System.out.println("Nothing was removed!");
		}
	}

	public void removeByType(String type) {
		boolean hasRemoved = false;
		for(int i = 0; i < this.garage.size(); i++) {
			if(this.garage.get(i).getType() == type) {
				this.garage.remove(i);
				hasRemoved = true;
				i--;
			}
		}
		if(!hasRemoved) {
			System.out.println("Nothing was removed!");
		}
	}

	public void emptyGarage() {
		this.garage = new ArrayList<Vehicle>();
	}

	public float bill() {
		float total = 0;
		for (Vehicle x : garage) {
			if (x instanceof Car) {
				total += (float) x.getValue() / 15;
			}
			else if (x instanceof Motorcycle) {
				total += (float) x.getValue() / 35;
			}
			
			else if (x instanceof Boat) {
				total += (float) x.getValue() / 10;
			}
			
		}
		return total;
	}
	
	public void fix() {
		System.out.println("It will cost " + bill() + " to fix all vehicles!");
		System.out.println("");
	}

	public void showGarageContents() {
		System.out.println("Garage has " + this.garage.size() + " vehicles:");
		for (Vehicle x : garage) {
			if (x instanceof Car) {
				System.out.println("ID: " + x.getId() + " | Type: " + x.getType() + " | Make: " + ((Car) x).getMake() + " | Model: " + ((Car) x).getModel() + " | Value: " + x.getValue());
			}
			else if (x instanceof Motorcycle) {
				System.out.println("ID: " + x.getId() + " | Type: " + x.getType() + " | Make: " + ((Motorcycle) x).getMake() + " | Model: " + ((Motorcycle) x).getModel()+ " | Value: " + x.getValue());
			}
			
			else if (x instanceof Boat) {
				System.out.println("ID: " + x.getId() + " | Type: " + x.getType() + " | Name: " + ((Boat) x).getName() + " | Value: " + x.getValue());
			}
			
			//System.out.println("ID: " + x.getId() + " | " + " Type: " + x.getType());
		}
		System.out.println("");
	}
}
