//What is constructor?
//What is overloading?
//What is constructor overloading?
//When to use "this" keyword?

class Car{
	int speed;
	String color;
	
	public Car() {
		speed=0;
		color="maroon";
	}
	
	public Car(int s,String c){
        speed=s;
        color=c;
    }

    public Car(int speed) {
        this.speed = speed;
    }
}


public class _3_Constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car bmw=new Car();
		bmw.color="white";
		bmw.speed=250;
        System.out.println("bmw's "+"color is "+bmw.color+" speed "+bmw.speed);

        Car audi=new Car();
        System.out.println("audi's "+"color "+audi.color+" speed "+audi.speed);
        
        Car benz=new Car(350,"black");
        System.out.println("benz's "+"color "+benz.color+" speed "+benz.speed);
        System.out.println(benz);
        
        Car vega=new Car(380);
        System.out.println("vega's "+"color "+vega.color+" speed "+vega.speed);     
	}
}
/*
constructors have the same name of a class
constructors functioning like a method, But actually it is not a method since it doesn't have any return type

We create our first Constructor when initialization process
Actually it happens when create an object
when we create an object,we are also creating a constructor without realizing it
eg:- "Car()" in the line of code "Car bmw=new Car();"

A class can contains any number of constructors, but they must be unique
new constructors will be created insight {} of the class after attribute,method declaration

constructors are considered a special kind of method, it will be call automatically when creating an object
some people does not consider constructor as a method because it doesn't have any return data type.
Constructor can contain access specifiers/access modifiers

>>>>>>Constructors can be useful to set default values for objects
these type of constructors are called default constructors
these type of constructor help to reduce code
eg:- object audi

>>>>>>Constructors can contain with parameters insight the parenthesis
these type of constructors are called parameterized constructors
these type of constructor help to reduce code
eg:- object benz

if we print object name it will return memory address
eg:-System.out.println(benz);

Intellij idea provides generate constructor option to easy access
Eclipse also provides generate constructor option to easy access
In eclipse right click>>>source>>>generate constructor using field>>>(tick omit call super class)

What is constructor overloading?
we are using same constructor name to create multiple constructors
this is possible because of combination of parameters logic
this is called constructor overloading
eg:-Car()
    Car(int s,String c)
    Car(int s,int c)
    Car(int s)

Overloading concept also exist in methods => method overloading

<<<<<<this keyword>>>>>
this keyword writes inside constructors
this key word used when
constructor's parameter variable and field have same name
eg:- Car(int speed) {
        this.speed = speed;}
If we use separate name for constructor's parameter variable this key word is not necessary
eg:- Car(int s,String c){
        speed=s;
        color=c;}
 */
