package garageTask;

public class Car extends Vehicle {
	// ==========================================
	// ATTRIBUTES
	// ==========================================
	protected String make;
	protected String model;
	protected boolean lights = false;

	// ==========================================
	// CONSTUCTORS
	// ==========================================
	public Car(String type, int wheels, float value, int maxSpeed, String make, String model) {
		super("Car", wheels, value, maxSpeed);
		this.make = make;
		this.model = model;
	}

	public Car(String make, String model, float value) {
		super("Car", value);
		this.make = make;
		this.model = model;
	}
	
	// ==========================================
	// METHODS
	// ==========================================
	public void honk() {
		System.out.println(make + " " + model + " honked its horn!");
	}
	
	public void toggleLights() {
		this.lights = !this.lights;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	

}
