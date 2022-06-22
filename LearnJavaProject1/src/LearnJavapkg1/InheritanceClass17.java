package LearnJavapkg1;
class Add{
    Add(){

    }//A default constructor to  avoid error
    Add(int a,int b){
        System.out.println(a+b);
    }//new constructor created
    void run(){
        System.out.println("This is add class");
    }//new method created

}//new class created
class Sub extends Add {
void run2(){
    System.out.println("This is sub class");
}//new method created
}//new class created

class Mul extends Sub{

}//new class created
public class InheritanceClass17 {
    public static void main(String[] args) {
        System.out.println("Inheritance concept");
        Add addition=new Add(2,3);//new object created
        addition.run();
        Sub s=new Sub();
        s.run();//Here  i run method in Add class and s is an object of Sub class
        s.run2();
        Mul s1=new Mul();
        s1.run();
        s1.run2();

    }
}
/*
extends key word used to inheritance
Sub class will use Add class's functionality
Sub class will inherit Add class:- Single level inheritance
Mul class will use Add,Sub Class functionality:-multiple


add gives its functionality to sub:therefor add class is super/parent class
sub class receives from add class:therefore sub class is called child/sub class
sub,add are the super class of mul
mul is the child class of add,sub
Add->sub->mul

if Add->sub,Add->mul,(not Sub->mul) is called hierarchical inheritance
In this case mul can't use sub's function

//multilevel inheritance is not in java



 */