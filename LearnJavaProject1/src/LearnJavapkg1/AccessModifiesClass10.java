package LearnJavapkg1;

public class AccessModifiesClass10 {
    public static void main(String[] args) {
        System.out.println("java programming");
        methodOne();//this is called calling function/method
        System.out.println(methodTwo());
        System.out.println(methodThree());
        System.out.println(methodFour(4,5));//4,5 are called arguments
        System.out.println(methodFive(2.5));//2.5 is arguments



    }
    //Create a method
    public static void methodOne(){
        System.out.println("method 1");
    }
    //Create another method
    private static int methodTwo(){return 9+8;}//when calling the function it will not print the value, it will just return the value
    //Create another method
    static String methodThree(){return "fathiramm";}
    //Create another method with input parameters
    static int methodFour(int num1,int num2){return num1+num2 ;}//num1,num2 are parameters
    //Create another method
    static double methodFive(double num3){return num3;}
}

/*
There are 3 main keywords in access modifier in java
A class can contain multiple methods
We are going to create our own methods within a class
They are public,private,protected by default compiler considered our method as public,if we not define as public it will automatically consider as public
private key will allow to access if method and method call function in same class:line6,9-11 in same class
int,float,string,void,... represent data types used in a method. void means any data type
 */