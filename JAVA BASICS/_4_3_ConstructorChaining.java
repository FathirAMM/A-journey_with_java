//constructor chaining using "super" keyword
//this is only possible when inheritance exist

class C{
    C(){
    	System.out.println("Constructor A called !");
    }
    C(int a){
    	System.out.println("Constructor A called ! "+a);
    	}
    }
class D extends C {
    D() {
    	super(5);
    	//try this again after commenting super(5);
    	//then it is come under type 1 constructor chaining.
    	System.out.println("Constructor D called !");
    	}
    }



public class _4_3_ConstructorChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 D object1=new D();
	}//this will call Constructor D & parameterized Constructor C

}
/*
if we want to call a particular constructor of a superclass we use "super" key word in subclass's constructor
 */