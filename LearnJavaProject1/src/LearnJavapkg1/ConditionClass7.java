package LearnJavapkg1;

import java.util.Scanner;

public class ConditionClass7 {
    public static void main(String[] args) {

        /*//to take input of cost
        Scanner input=new Scanner(System.in);
        int cost= input.nextInt();
        int pen=input.nextInt();
        */


        //if condition
        int pen=10;
        int cost=5;
        if (cost>pen){
            System.out.println("You can buy the pen!");
        }





        //if there is one statement under condition ,then you can omit {}
        //if-else condition
        int pen1=10;
        int cost1=5;
        if (cost1>pen1)
            System.out.println("You can buy the pen!");

        else {
            System.out.println("You have less money to buy a pen!");
            System.out.println("Cheers!");
        }





        //if elseif else
        int pen2=10;
        int specialPen=20;
        int cost2=5;
        if (cost2>specialPen){
            System.out.println("You can buy the special pen!");
        } else if (cost2>pen2) {
            System.out.println("You can buy a pen");
        } else {
            System.out.println("You have less money to buy a pen!");
        }
    }
}
