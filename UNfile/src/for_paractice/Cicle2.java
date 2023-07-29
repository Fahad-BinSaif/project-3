package for_paractice;

public class Cicle2 {
	
 double raduis ;
 static int numberOfobjects ;
 static final double pi= 3.14;
	public Cicle2() {
		raduis = 1.0;
		numberOfobjects++;
	}
	public Cicle2(double newRaduis){
		raduis = newRaduis;
		numberOfobjects++;
	}
	static int getNumberOfobject() {
		return numberOfobjects ;
	}
	public double getArea () {
		
		return raduis*raduis*pi;
	}
	static void area() {
		
	 
	}

}
