package for_paractice;

public class BOOK {
	private String Name ;
	private String Author ;
	private int pub_date;
	private int last_page;
	int Current_page ;
	private boolean oben_book = false;
	public BOOK (String n , String a , int p ,int l) {
	    Name = n;
	    Author = a;
	    pub_date = p;
		last_page = l;
	}
	// Create name of book ...
	public void SetName(String name) {
		Name = name;
	}
	// Create name of author ...
	public void SetAutho(String author) {
		Author = author ;
		
	}
	// Create publish date of book ...
	public void SetPubdate(int pdate) {
		pub_date = pdate;
	}
	// Create number of pages in book ...
	public void SetLpage(int page ) {
		last_page = page;
	}
	
	public boolean  open() {
		 if(oben_book) 
			   System.out.println("Is open !");
			 oben_book = true;
		return true;
	}
	public boolean close() {
		if(!oben_book)
			System.out.println("Is close !");
		oben_book = false;
		return false;
	}
	public boolean ch_page(int p) {
		if (!oben_book)
			return false;
		if (last_page < p || p < 0)
	  return false;
		 Current_page = p;
			 return true;  
		  
	}
	public void printinfo() {
		System.out.println("(BOOK ) : "+Name);
		System.out.println("AUTHOR  : "+Author);
		System.out.println("PAGES   : "+last_page);
		System.out.println("PUBDATE : "+pub_date);
	}
	}
	
	
	


