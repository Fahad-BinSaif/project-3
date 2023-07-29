package ميراج;

public class check extends Donation{
	
	private String bankname ;
	public check(double amount , String location , String donorName) {
		super(amount,location,donorName);
	}
	public String getBankName () {
		return bankname ;
	}

}
