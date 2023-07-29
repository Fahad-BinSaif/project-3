package HW;


public class Circle_2 {
static double raduis ;
static int numberOfobjects ;
static  double pi= 3.14;
public Circle_2() {
raduis = 1.0;
numberOfobjects++;
}
public Circle_2(double newRaduis){
raduis = newRaduis;
numberOfobjects++;
}


static int getNumberOfobject() {
	
return numberOfobjects ;

}
public double getArea () {
return raduis*raduis*pi;

}

}
