package ميراج;

public class Player {
	public Player() {
		
	}
	public Player(String n, int i) {
		name = n;
		ID = i;
	}
	public Player (Player a) {
		this.name=a.name;
		this.ID=a.ID;
		
	}
	private String name ;
	private int ID ;
	public void setName(String n) {
		name = n;
	}
	public void setID(int i) {
		ID = i;
	}
	public String getName () {
		return name ;
	}
	public int getID() {
		return ID;
	}
	

	

}
