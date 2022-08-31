

interface Aa{
	void display();
}
interface Bb{
	void display();
}
class Cc implements Aa,Bb{
	public void display(){
		System.out.println("A 's method");
	}	
}

public class _11_2_multipleInheritanceUsingInterface {
	public static void main(String[] args) {
		Cc obj=new Cc();
		obj.display();
	}
}
//we can not define two separate method for interfaces Aa&Bb using same method name
//Thus we can  avoid ambiguity when calling a same method name of 2 parents using child class objects
//But we can define two separate method for Aa&Bb using same method name if Aa&Bb are classes
//Thus when calling a same method name using child class objects there will an ambiguity arise
