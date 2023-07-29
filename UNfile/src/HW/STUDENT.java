package HW;

public class STUDENT {
	/*you can add more off Constructor in class 
	 * but you must change number of parameter 
	 * (Every time)
	 */
	private String name ;
	private int ID;
	static int count ;
	// Constructor without parameter 
	public STUDENT () {
		count ++;
	}
	// Constructor with parameter 
	public STUDENT (String n , int i) {
		name = n;
		ID = i;
		count ++;
	}
	public void setName(String n) {
		name = n;
	}
	public void setID(int i) {
		ID = i;
	}
	public String getName() {
		return name;
	}
	public int getID() {
		return ID;
	}
}
