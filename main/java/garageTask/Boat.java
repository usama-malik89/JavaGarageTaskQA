package garageTask;

public class Boat extends Vehicle {
	// ==========================================
	// ATTRIBUTES
	// ==========================================
	protected String name;
	protected boolean anchor = false;

	// ==========================================
	// CONSTUCTORS
	// ==========================================
	public Boat(int wheels, float value, int maxSpeed, String name) {
		super("Boat", wheels, value, maxSpeed);
		this.name = name;
	}

	public Boat(String name, float value) {
		super("Boat", value);
		this.name = name;
	}
	
	// ==========================================
	// METHODS
	// ==========================================
	public void honk() {
		System.out.println("The boat " + name + " honked its horn!");
	}
	
	public void toggleAnchor() {
		this.anchor = !this.anchor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
