//What is interface?

class Xyz{
	
}



interface Ridable{//usually interface name end with the suffix "able"
	 void ride(); //all methods insight interface are abstract and public by default,no need to mention it , if you want you can mention it
	 			  //..we cannot create concrete method insight interface.
}

class Carrr implements Ridable{
	@Override
	public void ride() {//here if we do not put public ,it will throw an error, because 
						//...if we do not put anything it will consider "default" , but 
						//..abstract method is public so, we need to put public here.
		System.out.println("You are riding a car !");
	}
}

class Bike extends Xyz implements Ridable{//It is allowed to do extends and implements at a time.
	@Override
	public void ride() {
		System.out.println("You are riding a bike !");
	}
}

class Mechanic{
	void check(Ridable r) {
		System.out.println("Checking....");
		r.ride();
	}
}


abstract class Carrr1 implements Ridable{}

public class _11_1_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mechanic m=new Mechanic();
		Carrr c=new Carrr();
		Bike b=new Bike();
		Ridable r=new Bike();//this is allowed
		//Ridable r=new Ridable(); this is not allowed, can not create object for interface
		m.check(c);
		m.check(b); 
	}

}

/*

What is Interface?

An interface in Java is a blueprint of a class.
• It has static constants and abstract methods.

Why we need interfaces?
• It is used to achieve abstraction.
• By interface, we can support the functionality of multiple inheritance.
• It can be used to achieve loose coupling.
• It is allowed to do extends and implements at a time.
•But we can extend only one class,  We can implement any number of interfaces.

• Cannot create the object of an interface
• Interface provides full abstraction as none of its methods have body.
• Interface does not contain any concrete method (full abstraction)
• Here we use "implements" key word instead of "extend" key word
• “implements” keyword is used by classes to implement an interface.
• While providing implementation in class of any method of an interface, it
needs to be mentioned as public.
• All the interface methods are by default abstract and public.
eg:-class Bike extends Xyz implements Ridable,Flexible{}

• Class that implements any interface must implement all the methods of
that interface, else the class should be declared abstract.
eg:-abstract class Carrr1 implements Ridable{}

• Variables declared in interface are public, static and final by default.
• A class can implement any number of interfaces.

• An interface can extend any interface but cannot implement it.
eg:- interface Qwerty extends Ridable{}

• Interface variables must be initialized at the time of declaration otherwise
compiler will throw an error
•Multiple inheritance is possible in interface


 */