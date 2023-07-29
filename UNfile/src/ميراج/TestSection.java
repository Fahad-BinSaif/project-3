package ميراج;

public class TestSection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Section sec=new Section(7);
        Student st1=new Student("fahad",111,20,"Male");
        Student st2=new Student("bader",222,10,"Male");
        Student st3=new Student("amal",333,23,"Female");
        Student st4=new Student("nora",444,18,"Female");
        Student st5=new Student("hasin",555,21,"Male");
        Student st6=new Student("reem",666,17,"female");
        
        System.out.println(sec.addStudent(st1));
        System.out.println(sec.addStudent(st2));
        System.out.println(sec.addStudent(st3));
        System.out.println(sec.addStudent(st4));
        System.out.println(sec.addStudent(st5));
        System.out.println(sec.addStudent(st6));
        System.out.println("------------------");
        
        System.out.println(sec.getNStudents("Male"));
        System.out.println(sec.getNStudents("female"));
        System.out.println("------------------");
        System.out.println(sec.search(000));
        System.out.println("---------[---------"); 
        System.out.println(sec.findMaxAge());
        System.out.println(sec.findMinAge());
        System.out.println("------------------");
        
        
        System.out.println("student's information : \n");
        System.out.println("--------------");
        System.out.println("the biggest person among them : \n");
        Student St=sec.findMaxStu();
        sec.printStuData(St.getID());
        System.out.println("------------------");
        System.out.println("The youngest person among them : \n");
        Student st = sec.findMinStu();
        sec.printStuData(st.getID());
        
        System.out.println("------------------");
       
        
        if(sec.deleteStud(111)==true)
                System.out.println("student deleted");
        else
                System.out.println("not found");
        System.out.println("-------");
        Student st7 = new Student ();
    
      Student[] arStu=sec.findStudents(19);
      
       
       System.out.println(sec.calculateTotalAges());
      System.out.println(sec.deleteStud(111));
         
		
}









        
    







     
	}


