package garageTask;

public class Vehicle {
	
	// ==========================================
	// ATTRIBUTES
	// ==========================================
	protected String type = "???";
	protected int wheels = 0;
	protected float value = 0F;
	protected int maxSpeed = 0;
	
	protected static int count = 1;
	protected int id = 0;
	
	// ==========================================
	// CONSTUCTORS
	// ==========================================
	public Vehicle(String type, float value) {
		this.type = type;
		this.value = value;
		this.id = count++;
	}
	
	public Vehicle( String type, int wheels, float value, int maxSpeed) {
		this.type = type;
		this.wheels = wheels;
		this.value = value;
		this.maxSpeed = maxSpeed;
		this.id = count++;
	}
	
	// ==========================================
	// METHODS
	// ==========================================
	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public int getId() {
		return id;
	}
	
	
	
	
}
