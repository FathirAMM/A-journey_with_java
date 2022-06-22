package LearnJavapkg1;

import java.util.Scanner;

public class ExceptionClass25 {
    public static void main(String[] args) {
        System.out.println("this is exception handling");
        try{
            //int number=10/0;
            Scanner input=new Scanner(System.in);
            int number1=input.nextInt();
            System.out.println(number1);
        }
        catch (Exception errrror){
            //System.out.println("some thing wrong");
            System.out.println("type a integer");
        }
        //optional blog
        finally{
            System.out.println("Always execute this code");
        }//optional blog
    }
}
//only one try,finally blog
//more than 1 cach blog allowed
//throw using user defined exception
/*
try{
    int num=10;
    if (num==10)
        throw new Exception()
        }
    catch(){
    System.out.println("qwerty");
*/