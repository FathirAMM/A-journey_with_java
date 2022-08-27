//What is Inheritance?
class Employeee{
	private String name;
	private double salary;
	
	public void setName(String name){
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public double getSalary() {
		return salary;
	}
	
	public void raiseSalary(double percent){
		salary+=salary*percent/100;
	}//method to calculate the salary after hike
	
	Employeee(String n,double s){
		name=n;
		salary=s;
	}
	
    Employeee(){
    	name="Name is null";
    	salary=0;
    }//default constructor for employee to avoid error when create parent-child relationship
    //when we create child class compiler looking for a default constructor of a parent class...
    //...if there is no such constructor it will generate error,  to avoid this .....
    //1)we can create a default constructor for base class... or.....
    //2)create a parameterized constructor to base class & then add super key word to child class
    //we can try one of them

}


class Managerr extends Employeee{
	private double bonus;
	
	public void setBonus(double bonus){
		this.bonus=bonus;
	}
	public double getBonus(){
		return bonus;
		}//a method for child class to get bonus
    @Override//annotation
    public double getSalary(){
        return super.getSalary()+bonus;
    }
	
	Managerr(String n,double s,double b){
		//name=n; can not use since name is private in parent class
        //salary=s; can not use since salary is private in parent class
        /*to resolve this we can use constructor of a parent class
        to do this we use "super" keyword*/
        super(n,s);  //after put this constructor we can remove the default constructor we created for parent class
		bonus=b;
	}
}


public class _9_1_Inheritance_OOPS {

	public static void main(String[] args) {
		Employeee e1=new Employeee("Ram",35000);
		e1.raiseSalary(10);
		System.out.println(e1.getName()+"'s salary is "+e1.getSalary());
		//e1.bonus=10000  <<we can not use this line because "e1" does not aware anything about bonus attribute>>
		
		 Managerr m0=new Managerr("Rajarajan",75000,10000);
	     System.out.println(m0.getName()+"'s salary is "+m0.getSalary());//Override method
			
		Managerr m1=new Managerr("Raja",65000,0);
		m1.setBonus(20000);
        System.out.println(m1.getName()+"'s salary is "+m1.getSalary());//Override method
        
      
      //special allowed options
        Employeee e2=new Managerr("Ramya",60000,0);//this is allowed in java  <<<<Polymorphism>>>>
        //e2.setBonus(20000); // But......, this is not allowed, To do this we have to perform casting
        //...because e2 is not directly object of Managerr class
        Managerr m2= (Managerr) e2;//casting
        m2.setBonus(20000);
        System.out.println(e2.getName()+"'s salary is "+e2.getSalary());
        System.out.println(m2.getName()+"'s salary is "+m2.getSalary());
       
        
        //Managerr m3=new Employeee("Samya",65000,0);//this is not allowed in java......
        //...bacause , not all employees are managers.
        
        //Managerr m4= (Managerr) e1;//this will generate error after run the code(run time error),but not before running
        //this type of casting is not possible
        
        
        //when we don't have any idea about an object that which is an instance of which class
        //we can use if condition to check it

        if (e1 instanceof Managerr)
            System.out.println("true");
        else
            System.out.println("false");
        
        if (e2 instanceof Managerr)
            System.out.println("true");
        else
            System.out.println("false");
		
		
        
        ////////////////ARRAY OF OBJECTS//////////////////

        //create more objects for a class within short time
        
//        int[] arr1=new int[5];// create an integer array with 5 members
//        arr1[0]=5;
//        arr1[1]=55;
//        arr1[2]=555;
//        arr1[3]=5555;

        Employeee[] emplyees=new Employeee[4];//an array of object of Employeee class , employees is array name
        emplyees[0]=new Employeee("Rama",20000);
        emplyees[1]=new Employeee("Harithas",30000);
        emplyees[2]=new Employeee("Varun",20000);
        emplyees[3]=new Managerr("Rajan",60000,5000);
        
        
        for(Employeee e:emplyees){
            System.out.println(e.getName()+"'s salary is "+e.getSalary());
        }
        /*
          Here first 3 objects of employee class(array of objects) uses Employee class's getSalary() method
          But 4th object will use overrided getSalary() method even it is written under Employee class
          This concept is called dynamic binding
          method overriding is the example of dynamic binding

         */
        
            
        
	}
}





/*
Parent class=Base class =Super class
Child class= derived class= Extended class= Sub class


When to use Inheritance?
Inheritance used when "is a " relationship
eg:- Manager is an Employee
Parent class= Employee
Child class= Manager

some more example for "is a " relationship
Car is a vehicle
Triangle is a shape

We use "extend" keyword to create parent child relationship
eg:- Manager extends Employee
when we create parent child relationship using extend keyword it gives error...
....To avoid this error we need to create a default constructor for parent class (eg: Employee)
We can remove this after constructor chaining using super keyword
eg: super(n,s)




<<<<<<<<<CODE SCENARIO>>>>>>>>>
Employee has name and salary
name and salary of an employee is in private
ram is an employee with the salary of 35000

create a method for employee as raiseSalary with parameter percent...
....to calculate the final salary of an employee.

print the salary of a ram after salary raised when the percent is 10.

Manager is an employee
bonus is an extra attribute of a manager class. Company provides extra bonus only to managers
create default constructor for parent class to avoid error
create a constructor for child class with 3 parameter (name, salary, bonus)

Raja is a manager with the salary of 65,000.
create a method for child class to set bonus,get bonus
A special bonus of 20,000 will be provided to Raja for his performance.
print the salary of a Raja after bonus added

Create an array of
<<<<<<<<<CODE SCENARIO>>>>>>>>>


There are 4 types inheritance
1)Single inheritance
eg:-
class A
class B extends A

2)Hierarchical inheritance
class A
class B extends A
class C extends A

3)Multi level inheritance
class A
class B extends A
Class C extends B

4)Multiple inheritance (Not allowed in Java)
class A
class B
class C extends A,B



//special allowed option
        Emplyeee e2=new Managerr("Ramya",60000,0);//this is allowed in java
because manager also an employee
this is allowed only when parent-child relationship

        Managerr m3=new Emplyeee("Samya",65000,0);//this is not allowed in java
not all employees are managers.



========Dynamic Binding / Dynamic method dispatch==========
This is happening when method overriding


=============================Casting=================================



 */