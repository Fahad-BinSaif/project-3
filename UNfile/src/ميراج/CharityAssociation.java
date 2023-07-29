package ميراج;
// it has a changes ...

public class CharityAssociation {
	private String name = null ;
	public int cou ;
	public Donation [] DoArray ;
	public CharityAssociation (String name , int size) {
		this.name = name ;
		DoArray = new Donation [size];
	}
	public boolean addDonation (Donation d) {
		if (cou < DoArray.length ) {
			DoArray[cou++]= new Donation(d);
			return true ;
		}
		else 
			return false;
		
	}
	public double avgCashDonation (String cur) {
		return cou;
	}
	
	

}
