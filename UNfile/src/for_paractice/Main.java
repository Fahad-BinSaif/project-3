package for_paractice;

public class Main {                                     

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Student.Count);
		Student s1 = new Student ();
		s1.setName("fahad");
		s1.setID(4443212);
		s1.setDg(63);
		s1.setGr(null);
		s1.printinfor();
		System.out.println("Student number : "+Student.Count);
		
	    System.out.println("------------");
        Student s2 = new Student ();
        s2.setID(4421189);
        s2.setDg(76);
        s2.setGr(null);
        s2.printinfor();
        System.out.println("Student number : "+Student.Count);
       
        System.out.println("------------");
        Student s3 = new Student ();
        s3.setName("abdullah");
        s3.setID(4449092);
        s3.setDg(92);
        s3.setGr(null);
        s3.printinfor();
        System.out.println("Student number : "+Student.Count);
        

}}
