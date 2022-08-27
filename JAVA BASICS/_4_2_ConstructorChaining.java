//"this" keyword & constructor chaining

class A{
    A(){
    	System.out.println("Default constructor called");
    	}
    A(int a){
    	this();//this key word must be write immediate after "{ "
    	System.out.println("Parameterized constructor called "+ a);
    	}
    A(int b,int c){
    	this(4);
    	System.out.println("Parameterized constructor called "+b+"&"+c);
    }
}


public class _4_2_ConstructorChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 A object1=new A(5);//this,will call 1^st & 2^nd constructors
	     System.out.println();
	     A object2=new A(5,5);//this,will call all constructors
	}

}

/*
"this" keyword is used to call constructors within same class
"this" keyword always writes within a constructor
 */
