
public class Address {

	private Integer addressId;
	private String city;
	private String country;

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Address(Integer addressId, String city, String country) {
		this.addressId = addressId;
		this.city = city;
		this.country = country;
	}

	public Address() {
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", city=" + city + ", country=" + country + "]";
	}

}
