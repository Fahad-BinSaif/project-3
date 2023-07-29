package ميراج;

public class Cash extends Donation {
    private String currency ;
	public Cash(double amount , String location , String donorName) {
		super(amount,location,donorName);
	}
	public String getCurrency() {
		return currency ;
	}
	public void display () {
		System.out.println("Currency "+currency);
	}

}
