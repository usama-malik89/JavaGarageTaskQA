package garageTask;

public class Motorcycle extends Vehicle {
	// ==========================================
	// ATTRIBUTES
	// ==========================================
	protected String make;
	protected String model;
	protected boolean lights = false;

	// ==========================================
	// CONSTUCTORS
	// ==========================================
	public Motorcycle(int wheels, float value, int maxSpeed, String make, String model) {
		super("Motorcycle", wheels, value, maxSpeed);
		this.make = make;
		this.model = model;
	}

	public Motorcycle(String make, String model, float value) {
		super("Motorcycle", value);
		this.make = make;
		this.model = model;
	}
	
	// ==========================================
	// METHODS
	// ==========================================
	public void rev() {
		System.out.println(make + " " + model + " revved its engine!");
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
