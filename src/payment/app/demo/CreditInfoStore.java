package payment.app.demo;

import java.util.Date;

public class CreditInfoStore {

	private String brand;
	private String owner;
	private Integer cardNumber;
	private long expiry;
	private String password;
	
	public CreditInfoStore(String brand, String owner, Integer cardNumber, long expiry, String password) {
		this.setBrand(brand);
		this.setOwner(owner);
		this.setCardNumber(cardNumber);
		this.setExpiry(expiry);
		this.setPassword(password);
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Integer getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(Integer cardNumber) {
		this.cardNumber = cardNumber;
	}

	public long getExpiry() {
		return expiry;
	}

	public void setExpiry(long expiry) {
		this.expiry = expiry;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void printInfo() {
		System.out.print(this.brand + " " + 
				this.cardNumber + " " + 
				this.expiry + " " + 
				this.owner + " " + this.password);
	}
}
