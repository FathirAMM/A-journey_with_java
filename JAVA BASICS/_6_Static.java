//What is the usage of "static" keyword?

class Student{
    int rollNo;
    int class_;
    static String principle;//static means fixed for entire class, one school has one principle, (static /class variable)
    public static void study(){//static method
        System.out.println("student is studying");
    }
}


public class _6_Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student karthik=new Student();
	        karthik.class_=12;
	        karthik.rollNo=12345;
//	      karthik.principle="Raju";
	        Student.principle="Raju";
	        Student.study();


	        Student vimal =new Student();
	        vimal.class_=11;
	        vimal.rollNo=12897;
	        System.out.println(vimal.principle);
	        System.out.println(Student.principle);

	}

}
/*
static key word can be used to reduce code and memory management
static key word can be applied to field,method,blocks,nested class
static variables are also called class variable
 */