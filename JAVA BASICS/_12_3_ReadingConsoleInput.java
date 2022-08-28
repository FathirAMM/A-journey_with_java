import java.util.Scanner;
//the Scanner class under java.util package
//taking user input 

public class _12_3_ReadingConsoleInput {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter your First name: ");
		String firstName = myObj.nextLine(); // Read user input
		System.out.println("Enter your Last name: ");
		String lastName = myObj.nextLine(); // Read user input
		System.out.println("Your name is: " + firstName + " " + lastName);
  
	}

}



