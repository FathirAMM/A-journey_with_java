import java.util.Scanner;

public class _17_Operators {

	public static void main(String[] args) {
		//Arithmetic operators (+,-,*,/,%,^)
		int a=10,b=5,c;
		c=a+b;//a,b are called operands and + is called operator
		c=a-b;
		c=a*b;
		c=a/b;
		c=a%b;//remainder //0
		c=a^b;//exponential
		
		//Assignment operators 
		c+=1;//c=c+1
		c-=1;//c=c-1
		c/=1;//c=c/1
		c*=1;//c=c*1
		c%=1;//c=c%1
		c^=1;//c=c^1
		
		//Unary operators
		c++;//post increment
		++c;//pre-increment
		c--;//post decrement
		--c;//pre-decrement
		//example:-
		a=11;
		c=a++;//first assign 11 to c then set the value of a is 12
		System.out.println("c is "+c);
		System.out.println("a is "+a);
		a=11;
		c=++a;//first  set the value of a is 12 then assign the value of a(11) to c
		System.out.println("c is "+c);
		System.out.println("a is "+a);
		
		
		//Relational operator
		a=8;
		c=4;
		double d=8.0;
		System.out.println(a==d);//true :type does not matter
		System.out.println(a!=d);
		System.out.println(a>c);
		System.out.println(a<d);
		System.out.println(a>=d);
		System.out.println(a<=d);
		
		
		System.out.println();
		
		//logical operator (short circuit operator)
		System.out.println(true && true);//and operator
		System.out.println(true || false);//or operator
		System.out.println(! true);//complement or negation
		
	
		
		
		//bitwise operator(&,|,^,~)
		a=15;//1111
		b=13;//1101
		System.out.println(a&b);//13//1111
		System.out.println(a|b);//15
		System.out.println(a^b);//xor
		//xor
		/*
		 0 xor 0 :0
		 0 xor 1 :1
		 1 xor 0 :1
		 1 xor 1 :0
		 */
		System.out.println(~a);//-16//Complement //returns -(a+1)
		
	
		System.out.println();
		
		
		//shift operator
		a=8;//1000.
		b=a<<2;//32//left shift//1000.->1000 00.//add 2 zeros in last
		System.out.println(b);
		b=a>>2;//2//right shift//1000.->10.00//remove 2 zeros in last
		System.out.println(b);
		
		
		
		//Ternary operator (kind of conditional operator)
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your marks ");
		int marks=input.nextInt();
		String results=marks>=40 ? "you passed": "you failed";
		System.out.println(results);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
