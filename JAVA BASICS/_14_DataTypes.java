import java.util.Arrays;

//Data types in Java
public class _14_DataTypes {

	public static void main(String[] args) {
		//primitive data types
		byte a=127;//8 bit 				//-128 to 127  =(-2^7) to (2^7-1)
		short b=32767;//16 bit			//-32768 to 32767  =(-2^15) to (2^15-1)
		int c=2147483647;//32 bit		//-2147483648 to 2147483647  =(-2^31) to (2^31-1)
		long d=999999999;//64 bit		//(-2^63) to (2^63-1)
		
		float e=4.0002f;//32 bit		//7 decimal
		//float e1=4.2; compile error
		double f=1235.47777;//64 bit    //16 decimal
		double f1=1235.255f;
		double f2=4563.2145d;
		//float f3=45.25d; //compile error
		
		boolean g=true;//1 bit		    //	0 or 1	
		
		//Character data type
		//ASCII: American Standard Code for Information Interchange
		//We can represent any character in a ASCII code format 
		//ASCII code is type of constant integer and it is unique for every character
		//example:ASCII value for "A" is 65,"B" is 66 
		char h='A'; //must be single quotation
		//char h1='mango';//compile error because char is a single character
		char h2=65;//ASCII code
		System.out.println(h);//A
		System.out.println(h2);//A
		h2+=1;
		System.out.println(h2);//B
		System.out.println((char)68);//casting
		
		//printing some ASCII code and Characters
		int i;
		for(i=33;i<=122;i++) {
			System.out.println("The ASCII value of "+(char)i+" is "+i);
		}
		
//=============================================================================//
//Reference data type
//******Default value of any reference variable is null******		
		
		String j="mango";
		String k = null;
		System.out.println(k);

		
//Arrays
//to create int array we need to create object for int class
		int marks[]=new int[3];//integer array
		marks[0]=56;
		//marks[1]=54;
		marks[2]=55;
		System.out.println(marks[1]);//0
		//print array
		int z;
		for(z=0;z<marks.length;z++) {
			System.out.println(marks[z]);
		}
		//print array
		System.out.println(Arrays.toString(marks));
		
		
		
		
		
		int[] stat= {1,2,3,4};	//easy method
		System.out.println(Arrays.toString(stat));
		
		char[] stat1= {'a','b','c'};	//easy method//character array
		System.out.println(Arrays.toString(stat1));
		
		
		
		int data[][]=new int[3][4];//[rows][columns]
		data[0][0]=1;
		data[0][1]=2;
		data[0][2]=3;
		data[0][3]=4;
		
		data[1][0]=1;
		data[1][1]=2;
		data[1][2]=3;
		data[1][3]=4;
		
		data[2][0]=1;
		data[2][1]=2;
		data[2][2]=3;
		data[2][3]=4;
			
				//casting
				double dd=10.0;
				System.out.println(dd);
				int ii;
				ii=(int)d;
				System.out.println(ii);
	}

}
/*
//There are 2 data types in JAVA
primitive data type
non-primitive or reference or object data type
primitive data type (8 type)
Primitive data types are predefined by the language and named by a keyword.
	Numeric
		Character
			:-Char
		Integral
			Integer
				:-Byte, short, int, long
			Floating-point
				:-float,double
	Boolean
		:-boolean
		
				
Non primitive data types
	:-String, Array, class objects
******Default value of any reference variable is null******
******Default value arise only  when create instance variable***** 
	
		
Java Literals
• A literal is a source code representation of a fixed value	
example: int a=5; //5 is literal
		
		
		
		
		
		
		
		
		
		
		
*/