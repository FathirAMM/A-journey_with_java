//let's understand why multiple inheritance not possible Java?

class A2{
	void display() {
	System.out.println("from class A2");	
	}
}
class B2{
	void display() {
	System.out.println("from class B2");	
	}
 }

class C2 extends B2{
	
}


public class _9_2_MultipleInheritance_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C2 c=new C2();
		c.display();

	}

}
/*
if we write the code.....

class C2 extends B2,A2{
}//multiple inheritance
then...
when we call a method of a parent class using child class object.........
if there is two parent class with same method name ,java will confuse which parent class method to run....
then it becomes an error

note that class A,B has same method name.

thats why multiple inheritance is not support in java.
*/
