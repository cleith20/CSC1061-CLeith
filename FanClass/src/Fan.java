
public class Fan {
	//Data Members
	private final int SLOW = 1;
	private final int MEDIUM = 2;
	private final int FAST = 3;
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5.0;
	private String color = "blue";
	
	private int id;
	static private int count = 0;
	
	//Constructors
	public Fan() {
		count++;
		id = count;
	}
	

	public Fan(int speed, boolean on, double radius, String color) {
		super();
		this.speed = speed;
		this.on = on;
		this.radius = radius;
		this.color = color;
		count++;
		id = count;
		
	}
	public int getId() {
		return id;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String fanOn() {
		if(isOn()) {
			return "\nFan speed = " + speed + " \nThe fan is on :)";
		}
		else {
			return "\nThe fan is off";
		}
	}

	//To String to convert data into a string
	@Override
	public String toString() {
		return "ID = " + id + "\nRadius = " + radius + "\nColor = " + color + fanOn() + "\n";
		
		}
	}
	
	
	
	


