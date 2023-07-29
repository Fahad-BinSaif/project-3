package Important;

public class Librarian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 , s2 , s3;
		s1 = new Student ();
		s1.setName("Ibrahim");
		s1.setEmail("Ibra55@gmail.com");
		s2 = new Student ();
		s2.setName("Abdullrahman");
		s2.setEmail("Abdull55@gmail.com");
		s3 = new Student();
		s3.setName("Mohammed");
		s3.setEmail("Moh2020@gmail.com");
		Librarycard card1 , card2 , card3 ;
		card1 = new Librarycard ();
		card1.setOwner(s1);
		card1.checkOut(4);
		card2 = new Librarycard ();
		card2.setOwner(s2);
		card2.checkOut(3);
		card3 = new Librarycard ();
		card3.setOwner(s3);
		card3.checkOut(6);
		
		System.out.println("First info ... \n"+card1.toString()+"\n");
		System.out.println("Second info ... \n"+card2.toString()+"\n");
		System.out.println("Third info ... \n"+card3.toString()+"\n");
	     
				
		
	}

}
