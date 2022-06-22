package LearnJavapkg1;
//Create a new class
//===========CLASS BLOG=======================
class NewClass{
    void useMe(){
        System.out.println("I am useMe method");
    }//useMe is a method
    void sub(int a,int b){
        System.out.println(a-b);
    }//sub is a method

}
//============CLASS BLOG======================


//============Primary class blog===============
public class ClassObjectsMethodsClass11 {
    public static void main(String[] args) {
        NewClass object1=new NewClass();
        object1.useMe();
        object1.sub(4,5);
    }
}
//============Primary class blog===============