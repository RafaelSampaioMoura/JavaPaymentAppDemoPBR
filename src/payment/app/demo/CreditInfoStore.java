package payment.app.demo;

import java.util.Date;

public class CreditInfoStore {

	private String owner;
	private Integer cardNumber;
	private Date expiry;
	private String password;
	
	public CreditInfoStore(String owner, Integer cardNumber, Date expiry, String password) {
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

	public Date getExpiry() {
		return expiry;
	}

	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
