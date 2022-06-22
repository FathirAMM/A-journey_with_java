package LearnJavapkg1;
class Student{
    int rollNo;//new state declared
    int class_;//new state declared
    static String principle;//new state declared//static means fixed for class
    static{
     String school="royal" ;
     String country="Canada";
     String region="western";
    }//this is called static block
    void display(){
        System.out.println("hi");
    }//new method created
}//new class created
public class StaticClass16 {
    public static void main(String[] args) {
        System.out.println("What is the purpose of static key word");
        Student karthik=new Student();//new object created
        karthik.class_=12;
        karthik.rollNo=12345;
        karthik.principle="Raju";
        System.out.println(Student.principle);

        Student vimal=new Student();//new object created
        vimal.class_=11;
        vimal.rollNo=12897;
        //vimal.principle="Raju";//A school has one principle
        System.out.println(Student.principle);




    }
}
/*
when we apply static keyword it became common for all object
So, you can not print it using object.principle
you can use class.principle
 */