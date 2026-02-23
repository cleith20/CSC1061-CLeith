
public class Person {
	// Data Members
	private String firstName;
	private String address;
	private long phoneNum;
	private String email;
	
	public Person(String name, String address, long phoneNum, String email) {
		this.firstName = name;
		this.address = address;
		this.phoneNum = phoneNum;
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String name) {
		this.firstName = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Name= " + firstName + ", Address= " + address + ", Phone Number= " + phoneNum + ", Email= " + email;
	}
	
	
}
