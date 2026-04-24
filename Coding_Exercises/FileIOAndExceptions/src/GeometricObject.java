import java.util.Date;

public class GeometricObject {
	//Data Members
	private String color = "Black";
	private boolean isFilled = false;
	private Date dateCreated = new Date();
	
	//Constructors
	public GeometricObject(String color, boolean isFilled) {
		this.color = color;
		this.isFilled = isFilled;
		dateCreated = new Date();
	}
	public GeometricObject() {
		
	}
	//Accessors and Mutators
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return isFilled;
	}
	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	@Override
	public String toString() {
		return "GeometricObject \nColor = " + color + ", Filled = " + isFilled + ", Date Created = " + dateCreated;
	}
	
	
}
