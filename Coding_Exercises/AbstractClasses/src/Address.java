
public class Address implements Cloneable {
	public String street;
	private String city;
	private String state;
	private long zip;
	
	public Address() {
		
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getZip() {
		return zip;
	}

	public void setZip(long zip) {
		this.zip = zip;
	}
	
	@Override
	public Address clone() throws CloneNotSupportedException{
		Address clone = (Address)super.clone();
		return clone;
	}
}
