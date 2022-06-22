package LearnJavapkg1;

class This{
    int number;//state declaration
    float number1;//new state declared
    This(int n) {
        number=n;
    }//a constructor created with 1 parameter

    This(float number1) {
        this.number1=number1;
    }//a constructor created with 1 parameter and the parameter is float
 /*
when constructor's variable and object's state is assigned same,
we use "this." keyword before object's state to avoid problems
 */
}//a new class This created






public class ThisKeyWordClass15 {
    public static void main(String[] args) {
        System.out.println("How to use this keyword");
        This object1=new This(5);//new object object1 created
        System.out.println(object1.number);
        This object2=new This(2.5F);
        System.out.println(object2.number1);

    }
}
/*
when constructor's variable and object's state is assigned same,
we use "this." keyword before object's state to avoid problems
 */