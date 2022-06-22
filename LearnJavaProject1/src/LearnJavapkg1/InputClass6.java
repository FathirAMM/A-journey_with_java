package LearnJavapkg1;

import java.util.Locale;
import java.util.Scanner;//automatic

//Scanner
//get input
public class InputClass6 {
    public static void main(String[] args) {

        //get integer input
        int number;
        Scanner input=new Scanner(System.in);//input is object
        System.out.println("Enter a number :");
        number =input.nextInt();
        System.out.println("The entered number is :"+number);


        //get float input
        float number1;
        Scanner input1=new Scanner(System.in);//input1 is object
        System.out.println("Enter a float number :");
        number1 =input1.nextFloat();
        System.out.println("The entered float number is :"+number1);


        //get string input (only work without space string)
        String name;
        Scanner input2=new Scanner(System.in);//input2 is object
        System.out.println("Enter your name :");
        name =input2.next();
        System.out.println("Hi :"+name.toUpperCase(Locale.ROOT)+ " "+ name.length());


        //get multiple input
        String name1;
        int a;
        int b;
        Scanner input3=new Scanner(System.in);//input3 is object
        System.out.println("Enter your name :");
        name1 =input3.next();//(only work without space string)
        System.out.println("Enter a number :");
        a=input3.nextInt();
        System.out.println("Enter another number :");
        b=input3.nextInt();
        System.out.println("Hi :"+name1.toUpperCase()+" "+(a+b));



        //get string input (work with space string)
        String name2;
        Scanner input5=new Scanner(System.in);//input5 is object
        System.out.println("Enter your name :");
        name2 =input5.nextLine();
        System.out.println("Hi :"+name2.toUpperCase()+ " "+ name2.length());








    }
}
