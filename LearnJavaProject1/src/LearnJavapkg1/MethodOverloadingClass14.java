package LearnJavapkg1;

public class MethodOverloadingClass14 {
    public static void main(String[] args) {
        System.out.println("method overloading lesson");
        add(2,3);//method add with 2 parameter called
        add(2);//method add with 1 parameter called
        add(2,3,4);//method add with 3 parameter called

    }
    static void add(int num1,int num2){
        System.out.println(num1+num2);
    }//method add created
    static void add(int num1){
        System.out.println(num1+num1);
    }//method add created,but notice method name same,# of parameter different
    static void add(int num1,int num2,int num3){
        System.out.println(num1+num2+num3);
    }//method add created,but notice method name same,# of parameter different

}
/*
creating same method name with different number of parameter is called
method overloading
 */