//What is method overriding?
//overriding occur when inheritance.
class A1{
    void display(){
        System.out.println("A1 class");}
    }

class B1 extends A1{
	
    @Override//annotation
    void display(){
    	System.out.println("B1 class");}}



public class _8_Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 object1=new B1();
        object1.display();
//Child class has more power when parent and child class have same method
        A1 object2=new A1();
        object2.display();
	}

}
/*
What is overriding?

•	Overriding  concept is for methods-method overriding
•	Overriding is not possible for constructors.
•	To achieve overriding we need classes with inheritance.
•	When a method of parent class has the same name, same parameters, same return type with  derived class overriding will come to play.
•	Method overriding is an example for runtime polymorphism.


when child and parent class has same method, when we create object for child constructor.....
....it will only call child class's function

it is standard to put @override annotation to avoid spelling mistake when write child class method's name
if we type wrong (eg:displaY),it will call parent class's method.
to avoid this issue we use annotation

 */