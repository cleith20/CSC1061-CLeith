
public abstract class FinancialInstitution implements Comparable<FinancialInstitution>, Cloneable {
	private String fiName;
	private long fiId;
	private long routingNumber = 123456;
	private Address address;

	public FinancialInstitution(String name) {
		fiName = name;
	}

	public String getFiName() {
		return fiName;
	}

	public void setFiName(String fiName) {
		this.fiName = fiName;
	}

	public long getFiId() {
		return fiId;
	}

	public void setFiId(long fiId) {
		this.fiId = fiId;
	}

	public long getRoutingNumber() {
		return routingNumber;
	}

	public void setRoutingNumber(long routingNumber) {
		this.routingNumber = routingNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	// any concrete subclass must implement this method
	public abstract double getInterestRate();

	@Override
	public int compareTo(FinancialInstitution o) {
		if (this.fiId < o.fiId) {
			return -4;
		} else if (this.fiId > o.fiId) {
			return 4;
		}
		return 0;
	}

	@Override
	public FinancialInstitution clone() throws CloneNotSupportedException {
		FinancialInstitution clone = (FinancialInstitution) super.clone(); // super.clone() returns an Object, cast it
		clone.address = address.clone();															// to FI
		return clone;
	}

	@Override
	public String toString() {
		return "~" + fiName + "\n   ID = " + fiId + " Routing Number = " + routingNumber + "\n   Address = " + address;
	}

}
