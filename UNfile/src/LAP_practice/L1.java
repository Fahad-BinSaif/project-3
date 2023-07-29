package LAP_practice;

public class L1 {
	String location ;
	double amount ;
	String donorname ;
	public L1(double Amount , String Location , String Donorname ) {
		location = Location;
		amount = Amount;
		donorname = Donorname ;
		
	}
	public void setDon_or_name(String n) {
		donorname = n;
	}
	public void setAmount(double a) {
		amount = a;
	}
	public void setLocation (String l) {
		location = l;
	}
	
	
		public String getDon_or_name() {
			return donorname ;
	}
		
	
	    public double getAmount() {
		return amount ; 
	}
	    public String getLocation () {
		return location;
	}
	    public void printinfo() {
	    	System.out.println(amount+"\n"+location+"\n"+donorname);
	    }
	    public static void main (String []args ) {
	    	L1 l = new L1(10.0,"Riyadh","done");
	    	
	    	l.printinfo();
	    }
	

}
