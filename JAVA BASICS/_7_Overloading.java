//method overloading & Constructor overloading

//constructor overloading
class Carr{
    Carr(){}//constructor1
    Carr(int a){}//constructor2
    Carr(String b){}//constructor3
    Carr(int c,int d){}}//constructor4


public class _7_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(2,3);
        add(2);
        }
	
	
    static void add(int num1,int num2){//new method
        System.out.println(num1+num2);}
    static void add(int num3){//new method
        System.out.println(num3+num3);}

}
/*
Over loading concept can be applied to constructors and methods

using same constructor name to create multiple constructors-constructor overloading
using same method name to create multiple methods-method overloading

Constructor overloading already discussed when we study constructors
eg:- constructors of carr class in this java file

If a class has multiple methods having same name but different in parameters, it is known as method overloading.
eg:- method add in this java file
 */