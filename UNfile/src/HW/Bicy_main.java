package HW;

public class Bicy_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicycle bike1 , bike2;
		String owner1 , owner2;
		bike1 = new Bicycle();
		bike1.setName("Fahad");
		
		bike2 = new Bicycle();
		bike2.setName("Ahmed");
		
		
		owner1 = bike1.getName();
		owner2 = bike2.getName();
		System.out.println(owner1+" owns a bicycle ");
		System.out.println(owner2+" also owns a bicycle ");

	}

}
