package for_paractice;

public class Account {
	// data member..
	private String ownername;
	private double balance;
	//contractor with no parameter...
	public Account () {
		ownername = "Unsigned";
		balance = 0.0;
		}
	// 
		public void add (double amt) {
			balance = amt;	
	}
		public void deduct (double amt) {
			balance = balance - amt ;
		}
		public void setbalance(double bal) {
			balance = bal;	
		}
		public void setowner (String name) {
			ownername = name ;
		}
		public double getblance() {
			return balance;
		}
		public String getowner () {
			return ownername;
		}
}