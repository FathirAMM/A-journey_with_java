//Exception handling?
public class _15_1_ExceptionHandling {

	public static void main(String[] args) {
		//int i=1/0;//Runtime exception (Arithmetic exception)
		int number[]=new int[2];
		number[0]=1;
		number[1]=2;
		//number[2]=3;//Runtime exception (ArrayIndexOutOfBoundsException)
		String s=null;
		//s.length();//Runtime exception (NullPointerException)
		
		
		
		
		
		
		
		
		
		
		//simple try catch block for runtime exception (ArrayIndexOutOfBoundsException)
		try {
			//protected code
			System.out.println(number[2]);
		}catch (ArrayIndexOutOfBoundsException e){
			//catch block
			System.out.println("Exception thrown :" + e);
		}
		
		
		
		
		
		
		
		
		
		
		
		//simple try catch block for runtime exception (NullPointerException)
		try {
			//protected code
			System.out.println(s.length());
		}catch (NullPointerException e){
			//catch block
			System.out.println("Exception thrown :" + e);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		//simple try catch block for runtime exception (Arithmetic exception)
		try {
			//protected code
			System.out.println(1/0);
		}catch (ArithmeticException e){
			//catch block
			System.out.println("Exception thrown :" + e);
		}	
		
		
		
		
		
		
		
		
		
		
		//multiple catch block allowed but only one try block
		try {
			//protected code
			System.out.println(number[5]);
			System.out.println(s.length());
			System.out.println(5/0);
		}catch (NullPointerException e){
			//catch block
			System.out.println("Exception thrown :" + e);
		}catch (ArithmeticException e){
			//catch block
			System.out.println("Exception thrown :" + e);
		}catch (ArrayIndexOutOfBoundsException e){
			//catch block
			System.out.println("Exception thrown :" + e);
		}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//finally keyword in try catch block
		try {
			//protected code
			System.out.println(1/0);
		}catch (ArithmeticException e){
			//catch block
			System.out.println("Exception thrown :" + e);
		}finally {
			System.out.println("Finally block always executes");
		}
			
		
		
		
		
		//throw
		sampleMethod();
		
		
		//throws
		try {
			sampleMethod1();
		}catch(Exception e) {
			System.out.println("throws......");
		}
		
		
		
		
	}//main method closed
	
	
	
	
	
	
	
	
	//throw & throws keyword
			//• Throw Used to throw and exception explicitly.
			//• Throws Used to declare exceptions
			
			//throw
			//In previous cases Java decides what exception need to throw when an event occur
			//But here we decide what exception need to throw
			static void sampleMethod() {
				try {
					throw new ArithmeticException("exception explicitely thrown......");
					
				}catch(ArithmeticException e){//Exception is superclass of all other exception
					System.out.println("Exception thrown :" + e);
				}
			}
			
			
			
			
			
			
			//throws
			static void sampleMethod1() {
				throw new ArithmeticException("Test ex......");
				//no try block here 
			}

}
/*
Checked exception (Compile time exception)
Unchecked exception (Runtime exception) 
when an exception occur program will terminate & the program flow will stop

 

*/