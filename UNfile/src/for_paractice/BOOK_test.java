package for_paractice;

public class BOOK_test {
	public static void main (String []arsg ) {
		
		BOOK java = new BOOK("Java","Fahad",2020,500);
		BOOK python = new BOOK ("Python","bdullah",2021,495);
		BOOK C = new BOOK("C++","Ibrahin",2019,550);
		java.printinfo();
		System.out.println("------------");
		python.printinfo();
		System.out.println("------------");
		C.printinfo();
		System.out.println("------------");
		java.open();
		System.out.println(java.ch_page(499));
		System.out.println(java.Current_page);
		java.close();
		System.out.println("");
		python.open();
		System.out.println(python.ch_page(490));
		System.out.println(python.Current_page);
		python.close();
		System.out.println("");
		C.open();
		System.out.println(C.ch_page(444));
		System.out.println(C.Current_page);
		C.close();
		
	}

}
