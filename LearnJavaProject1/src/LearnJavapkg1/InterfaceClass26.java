package LearnJavapkg1;

interface in{
    void m1();
    int m2();

}//this is class but dont specify class keyword
interface inn{

}
class in1 implements in,inn{
    public void m1(){

    }
    public int m2(){
        return 0;


    }

}
public class InterfaceClass26 {
    public static void main(String[] args) {
        System.out.println("API :AP Interface");
    }
}
/*
here we use implements keyword

multilevel inheritance is not work in java
but it can be done using interface concept
 */