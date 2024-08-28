package billingdetails;

public class Billingd {//billing class
	int bid;
	String firstName;
	String lastName;
	String phone;
	String city;
	String country;
	String address;
	String email;
	String username;
	public Billingd(int bid, String firstName, String lastNmae, String phone, String city, String country,
			String address, String email, String username) {//constructer
		super();
		this.bid = bid;
		this.firstName = firstName;
		this.lastName = lastNmae;
		this.phone = phone;
		this.city = city;
		this.country = country;
		this.address = address;
		this.email = email;
		this.username = username;
	}
	public int getBid() {//getters
		return bid;
	}
	
	public String getFirstName() {//getters
		return firstName;
	}
	
	public String getLastName() {//getters
		return lastName;
	}
	
	public String getPhone() {//getters
		return phone;
	}
	
	public String getCity() {//getters
		return city;
	}
	
	public String getCountry() {//getters
		return country;
	}
	
	public String getAddress() {//getters
		return address;
	}
	
	public String getEmail() {//getters
		return email;
	}
	
	public String getUsername() {//getters
		return username;
	}
}
