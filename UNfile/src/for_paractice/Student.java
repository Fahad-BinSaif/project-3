package for_paractice;

public class Student {
	// Variable of student name..
	private String name;
	// Variable of student grade..
	private String grade;
	// Variable of student ID..
	private int stID;
	// Variable of student degree..
	private int degree;
	// Counter variable..
	
	static int Count=0;
	public Student () {
		Count++;
	}
    	
	// Write Student name.
	public void setName (String n) {
		name = n;
		
		
		
	}
	// Write Student ID.
	public void setID (int id) {
		stID = id;
	
	}
	// Write Student Degree.
	public void setDg (int d){
		degree = d;	
	}
	// Write Student Grade.
	public void setGr (String a) {
	 if (degree <= 100 && degree >90) {
		 grade = "A+";
	 }
	 else if (degree <= 90 && degree >80) {
		 grade = "B+";
		}
	 else if (degree <= 80 && degree >70) {
		 grade = "C+";
		}
	 else if (degree <= 70 && degree >=60) {
		 grade = "D+";
		}
	 else if (degree < 60) {
		 grade = "F";
	 }
	 else 
		 grade = "F";
	 }
	// Return Student name. 
	public String getName() {
		return name ;
	}
	// Return Student ID.
	public int getID () {
		return stID;
	}
	// Return Student Degree.
	public int getDg () {
		return degree;
	}
	// Return Student Grade.
	public String getGr () {
		return grade ;
	}
    // Show the Student Information.
	public void printinfor () {
		System.out.println("ST is : "+getName()+"-"+getID()+"-"+getDg()+"-"+getGr());
	

		
	}
	
}
