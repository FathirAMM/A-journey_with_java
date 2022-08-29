package PastPaper_2016;

import java.util.Scanner;

public class BMI {
	
	public static void main(String[] args) {
		double weight;
		double height;
		double bmi;	
		
		Scanner Input=new Scanner(System.in);
		System.out.println("Enter your weight in kg: ");
		weight=Input.nextDouble();
		System.out.println("Enter your height in meters: ");
		height=Input.nextDouble();
		
		bmi=weight/(height*height);
		System.out.printf("Your BMI is "+bmi);
	}
	
}
