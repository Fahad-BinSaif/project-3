package ميراج;

public class Student {
private String studName ;
private int studID ;
private String gender ;
private int sudeAge ;
public Student () {
	
}
public Student (String name ,int ID ,  int age , String gender) {
	studName = name ;
	studID = ID ;
	this.gender = gender ;
	sudeAge = age ;
	
}
public void setName (String n) {
	studName = n;
}
public void setID (int i) {

}
public void setGender (String g) {
	gender = g;
}
public void setAge  (int a) {
	sudeAge = a;
}
public String getName () {
	return studName ;
}
public int getID () {
	return studID ; 
}
public String getGender () {
	return gender ;
}
public int getAge () {
	return sudeAge ;
}
public void printinfo() {
	System.out.println("Name : "+studName);
	System.out.println("ID : "+studID);
	System.out.println("Age : "+sudeAge);
	System.out.println("Gender : "+gender);
}
}
