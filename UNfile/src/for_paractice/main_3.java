package for_paractice;

public class main_3 {
	public static void main (String []args ) {
		Account ACU = new Account ();
	   ACU.setowner("FAHAD");	
	   ACU.add(132500);
	   ACU.deduct(59030);
	   ACU.setbalance(73470);
	   System.out.println("AC 1 : "+ACU.getowner() +" "+ ACU.getblance());
	   
	}

}
