package for_paractice;

public class main_4 {

	public static void main(String[] args) {
		System.out.println("The number of Circle object is "+Cicle2.numberOfobjects);
		
		Cicle2 c1 = new Cicle2();
		System.out.println("c1 raduis : "+"("+c1.raduis+")"+"and number of Circle object" + "("+c1.numberOfobjects+")");
		System.out.println("\nAfter creating c2 nodyfying c1\n");
		
		Cicle2 c2 = new Cicle2(5);
		System.out.println("c1 raduis : "+"("+c1.raduis+")"+"and number of Circle object" + "("+c1.numberOfobjects+")");
		System.out.println("c2 raduis : "+"("+c2.raduis+")"+"and number of Circle object" + "("+c2.numberOfobjects+")");
	
		
	}}