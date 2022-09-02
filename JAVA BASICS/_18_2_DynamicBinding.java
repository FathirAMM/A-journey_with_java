//Dynamic binding occur when method overriding
class Subbclass extends _18_2_DynamicBinding {
	public void print() {
System.out.println("print in subbclass.");
	}
}


public class _18_2_DynamicBinding {
	
	public void print() { 
		System.out.println("print in superclass.");
		}

	public static void main(String[] args) {
		_18_2_DynamicBinding A = new _18_2_DynamicBinding();
		_18_2_DynamicBinding B = new Subbclass();
		A.print();//print in superclass.
		B.print();//print in superclass.


	}

}
/*
Dynamic Binding

When compiler is not able to resolve the call/binding at compile time,
such binding is known as Dynamic or late Binding. Method
Overriding is a perfect example of dynamic binding as in overriding
both parent and child classes have same method and in this case
the type of the object determines which method is to be executed.
The type of object is determined at the run time so this is known as
dynamic binding.
*/