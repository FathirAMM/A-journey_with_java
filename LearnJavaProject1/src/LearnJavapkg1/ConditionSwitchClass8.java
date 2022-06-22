package LearnJavapkg1;


//import java.util.Scanner;

public class ConditionSwitchClass8 {
    public static void main(String[] args) {
        int number=10;
        String name="raj";
        /*
        Scanner input=new Scanner(System.in);
        String name= input.next();
         */


        switch (name){
            case "karthik":
                System.out.println("Hi "+name);
                break;
            case "karik":
                System.out.println("Hi "+name);
                break;
            case "raj":
                System.out.println("Hi "+name);
                break;
            default:
                System.out.println("Name not found ");
        }



        switch (number){
            case 1:
                System.out.println("Hi "+number);
                break;
            case 2:
                System.out.println("Hi "+number);
                break;
            case 3:
                System.out.println("Hi "+number);
                break;
            default:
                System.out.println("Num not found ");
        }












        System.out.println();
    }
}
