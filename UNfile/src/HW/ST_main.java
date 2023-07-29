package HW;

public class ST_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		STUDENT S1 = new STUDENT("FAHAD",11200);
		System.out.println("Student number "+STUDENT.count+" : "+S1.getName()+" , ID : "+S1.getID());
		
		System.out.println("--------------");
		STUDENT S2 = new STUDENT ();
		S2.setName("AHMAD");
		S2.setID(12110);
		System.out.println("Student number "+STUDENT.count+" : "+S2.getName()+" , ID : "+S2.getID());
	}

}
