package ميراج;

public class Donation {

	private double amount ;
	private String location ;
	private String donorName ;
	
	public Donation (double amount , String location , String donorname) {
		
	}
	
	public Donation(Donation d) {
		
	}
	

	public String getDonorName() {
		return donorName ;
	}
	public double getAmaount () {
		return amount ;
	}
	public String getLocation () {
		return location ;
	}
	public void display() {
		System.out.println("Amount : " + amount);
		System.out.println("Location : " +location);
		System.out.println("DonorName : " + donorName);
	}


}
