package coffeeShop;

public class Customer {
	
		int id;
		String name;
		String surname;
		String ssn;
		String birthdate;
	
	public Customer(int id, String name, String surname, String ssn, String birthdate) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.ssn = ssn;
		this.birthdate = birthdate;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
}
