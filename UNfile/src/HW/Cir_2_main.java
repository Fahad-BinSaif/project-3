package HW;

public class Cir_2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle_2 C1 = new Circle_2 ();
		Circle_2.raduis = 5;
		System.out.println(Circle_2.getNumberOfobject()+" : "+C1.getArea());
		
		Circle_2 C2 = new Circle_2(10.5);
		System.out.println(Circle_2.getNumberOfobject()+" : "+C2.getArea());
       
	}
	

}
