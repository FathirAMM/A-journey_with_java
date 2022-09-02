//Binding
//What is binding?
//Virtual method invocation or Remote method invocation

class Subclass extends _18_1_StaticBinding {
	public void print() {
System.out.println("print in subclass.");
	}
}


public class _18_1_StaticBinding {
	
	private void print() { //This can be Static or final
		System.out.println("print in superclass.");
		}

	public static void main(String[] args) {
		_18_1_StaticBinding A = new _18_1_StaticBinding();
		_18_1_StaticBinding B = new Subclass();
		A.print();//print in superclass.
		B.print();//print in superclass.


	}

}
/*
Association of method call to the method body is known as binding. 
There are two types of binding:
• Static Binding (Early Binding) that happens at compile time
	Static Binding (Early Binding)
• Dynamic Binding (Late Binding) that happens at runtime.
	When type of object is determined at runtime, it is dynamic binding.



• Static Binding (Early Binding)
The binding which can be resolved at compile time by compiler is known as static or early binding.
Binding of all the static, private and final methods is done at compile-time.

Why binding of static, final and private methods is always a static binding?

Compiler knows that all such methods cannot be overridden and will always be
accessed by object of local class. Hence compiler doesn’t have any difficulty to
determine object of class (local class for sure). That’s the reason binding for
such methods is static.





*/