//How to implement real world objects into java code?

class Animals{
	String name;
	String variant;
	int age;
	
	public void eat() {
		System.out.println("Animal is eating....");
	}
	public void run() {
		System.out.println("Animal is running....");
	}
	public void bark() {
		System.out.println("Animal is barking....");
	}
}//void used before methods to say, it does not have any data type



public class _2_RealWorldScenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animals dog=new Animals();
		dog.name="doggy";
		dog.variant="pit bull";
		dog.age=4;
		System.out.println("Dog's name is "+dog.name);
		System.out.println("Dog's variant is "+dog.variant);
		System.out.println("Dog's age is "+dog.age);
		dog.eat();
		dog.bark();
		dog.run();
		
		Animals cat=new Animals();
		cat.name="Kitty";
		cat.variant="xyz";
		cat.age=2;
		System.out.println("Cat's name is "+cat.name);
		System.out.println("Cat's variant is "+cat.variant);
		System.out.println("Cat's age is "+cat.age);
		cat.eat();
		cat.run();
	}
}
/*
Class:-Class is a blueprint/ Template to create an object.
    eg:- Animals
Object:-Object is an instance of a class.
    eg:-dog,cat

Every object has state & behavior
    State=Attribute=Fields=Instance variables=Features
    Behavior=Methods=Operations

eg:-
    Class:Animal
    Object:Dog
    State:Name,Age,Variant
    Behavior:eat,bark,run

A Java Class can contain
    fields
    methods
    constructors
    blocks
    nested classes
    interfaces

One Java file can contain more than one classes.But...............
There should be one class with the same name of the file name, and it should be in public.
eg:- the class "_2_RealWorldScenario" in this .java file
Only one class can be stated as public in a .java file. Don't put access modifier as public to other classes.
eg:- the class "Animals" in this .java file


Class name
    start with _ or letters
    can not start with numbers
    Pascal naming convention (eg:- ThisIsFirstClass)

method name is in camel naming convention(eg:- thisIsMyFirstMethod())

We can create any number of objects for a class

Understanding terminologies -Declaration,Instantiation,Initialization
consider the line of code :Animals dog=new Animals();
declaration:Animals dog
variable declaration also kind of declaration
Instantiation & Initialization:dog=new Animals();
Instantiation & Initialization are occurring in the same time
Instantiation happens when put a "new" key word
Initialization happens when put constructor "Animals()"
Animals() is called constructor, it will be discussed later
Constructors have the same name of a class
when we create an object a constructor will automatically create
 */
