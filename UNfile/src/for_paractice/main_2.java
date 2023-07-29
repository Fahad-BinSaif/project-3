package for_paractice;

public class main_2 {
	public static void main (String []args ) {
		// Creat an variable String type.... 
		Bicycal bike1;
	    Bicycal bike2;
	    // Declaration an object...
	    String owner1 , owner2 ;
	    // Creation an object 
	    bike1 = new Bicycal();
	    // calling seter method to add value.
	    bike1.setownername("fahad");
	    // calling geter method to show the value.
	    owner1 = bike1.getownername();
	    System.out.println(owner1);
	    // Creation an object 
	    bike2 = new Bicycal();
	    // calling seter method to add value 
	    bike2.setownername("Adel");
        // calling seter method to show the value 
	    owner2 = bike2.getownername();
	    System.out.println(owner2);
	    
	}

}
