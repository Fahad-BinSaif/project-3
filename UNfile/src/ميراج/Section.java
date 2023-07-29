package ميراج;


public class Section {
private Student arrayStu [];
private int counter ;

public Section () {
	
}
public Section (int size) {
	/*قيمة الاراي تكون نفس قيمة السايز اللي ادخلها المستخدم*/
	arrayStu = new Student [size];
	/*قيمة الكونتر تكون نفس عدد الاوبجيكتات اللي ادخلها المستخدم*/
	counter = 0;
}
/*هنا يشوف اذا كان عدد الكاونترات اصغر من عدد الاراي معناته راح يقبله ويرجع لنا ترو 
 * اما اذا كان عدد الكاونترات اكبر من عدد الاراي معناته راح يرفضه ويرجع لنا فولس*/
public boolean addStudent (Student stu) {
if (counter<arrayStu.length)	{
	arrayStu[counter] = stu;
	counter ++ ;
	return true ;	
}
else 
	return false ;
}
/*
 * هنا يشوف هل القيمة اللي ادخلها المستخدم موجود في احد عناوين الاراي للآيدي ولالا
 * اذا هي موجودةالميثود راح ترجع عنوان الاراي اللي هي فيه , واذا مو موجود فالميثود راح
 *  ترجع لنا -1 بمعنى ان القيمة اللي ادخلها المستخدم مو موجودة في الاراي 
 * */
public int search (int id) {
	for (int i = 0 ; i < counter ; i ++) 
		if (id == arrayStu[i].getID())
			return i;
	
	
		return -1 ;

}
/*في الميثود هذي راح نعتمد على قيمة الآيدي اذا كانت الايدي موجوده في احدعناوين الاراي راح يحذفها 
 * واذا قيمة الايدي اللي ادخلها المستخدم مو موجودة في احد عناوين الاراي راح يرجع لنا فولس*/
public boolean deleteStud(int id) {
	int endex = search (id);
	if (endex == -1)
		return false ;
	
	else {
		/*تحتاج توضيح*/
		arrayStu[endex]=arrayStu[counter-1];
		arrayStu[counter-1]=null;
		counter--;
        return true;
}
}
/*هنا يشوف هل قيمة العمر فالاراي اوف آي اكبر من الماكس ,,, 
 *  اذا كانت اكبر فـ راح يستبدل قيمة الماكس بالاراي اوف آي 
 *  اما اذا كانت قيمة الماكس اكبر فـ راح يسترجعها بدون ان يعدل قيمتها
 *   */
public int findMaxAge()
{
        int max =arrayStu[0].getAge();
        for(int i=0; i<counter; i++)
                if(arrayStu[i].getAge()>max)
                        max = arrayStu[i].getAge();
        return max;
}
/*نفس فكرة الماكس ولكن بدال يشوف اكبر قيمة للعمر راح يشوف اصغر قيمة */
public int findMinAge()
{
        int min =arrayStu[0].getAge() ;
        for(int i=0; i<counter; i++)
                if(arrayStu[i].getAge()<min)
                        min = arrayStu[i].getAge();
        return min;
}


/*هذي الميثود تعطينااكبر طالب بالاعتماد على قيت ايج*/
public Student findMaxStu()
{
	Student max=arrayStu[0];
	for(int i=1; i<counter; i++)
        if(arrayStu[i].getAge()>max.getAge())
                max = arrayStu[i];
	
	
return max;
	
}
/*هذي الميثود اصغر طالب بالاعتمادعلى قيت ايج*/
public Student findMinStu()
{
	Student min=arrayStu[0];
	for(int i=1; i<counter; i++)
        if(arrayStu[i].getAge()<min.getAge())
                min = arrayStu[i];
return min;
	
}




public double calculateTotalAges()
{
        double sum = 0.0;
        for(int i=0; i<counter; i++)
                sum += arrayStu[i].getAge();
        return sum;
}
public double calculateAvgAge()
{
        if (counter==0)
                return 0.0;
        else
                return calculateTotalAges()/counter;
        
}
/* to show if index equal to {search(id)..}
 *then doing (test)between {index and -1}..
 *if equal -1 print "Student not Found" ..
 *else print the information.
 */
public void printStuData(int id){
        int index=search(id);
        if(index==-1) { 
        
         System.out.println("Student not Found");
        }
        
        else {
        System.out.println("Name = "+arrayStu[index].getName());
        System.out.println("Id = "+arrayStu[index].getID());
        System.out.println("Age = "+arrayStu[index].getAge());
        System.out.println("Gender = "+arrayStu[index].getGender());
        	    
         
        }
        
}

public Student[] findStudents(int age)
{
	Student temp[]=new Student[counter];
	
	int j=0;
	
	for(int i=0;i<counter;i++)
		if(arrayStu[i].getAge()<age)
		{
			temp[j]=arrayStu[i];
			j++;
		}
	
	return temp;
	
		
	
}

/* to show if array[i] of getGender = gender Regardless of case.
and print number of each kind */
public int getNStudents(String gender)
{
	
	int count = 0;
	for(int i=0;i<counter;i++)
		if(arrayStu[i].getGender().equalsIgnoreCase(gender)) {
			count++;
		
		}
			
		
		return 	 count;  
	}






        

}







