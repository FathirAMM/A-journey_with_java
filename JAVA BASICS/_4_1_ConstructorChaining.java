//inheritance & constructor chaining

class Parent {
	
    Parent() {
        System.out.println("Constructor Parent called !");
        }  
    Parent(int a){
    	System.out.println("Constructor Parent with parameter called !");
    }
    }
class Child extends Parent{
    Child() {
        System.out.println("Constructor Child called !");
        }
    Child(int b){
    	System.out.println("Constructor Child with parameter called !");
    }
    }


public class _4_1_ConstructorChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Child object1=new Child();
		  //Child class constructor will automatically call Parent class's default constructor
		  Child object2=new Child(5);
		  
	}

}
/*
Inheritance is one of the importance concept in oops
Child class=Derived class=subclass
Parent class=Base class=super class
if A is parent class & B is child class then, when we create B class we often write....
class B extends A


Constructor chaining concept used to call a constructor with the help of another constructor

Child class's any constructor automatically call Parent class's default constructor when child class constructor called.
note that only call default constructor of the parent class.

if parent class does not have default constructor/ parent class only have parameterized constructor/....
...parent class doesn't have any constructor then it will only call child class constructor. 
 */