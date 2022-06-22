package LearnJavapkg1;

abstract class Bike{
    void run(){
        System.out.println("run");
    }//new method created
    abstract void running();//new method declaration

}//new class created
class pulsar extends Bike{
    void running(){
        System.out.println("running");
    }//define

}//new class created

public class AbstractClass22 {
    public static void main(String[] args) {
        System.out.println("Abstract");
        Bike obj=new pulsar();
        obj.run();
        obj.running();

    }
}
/*
Data hiding
if a method is abstract then its class should be abstract
pulsar is called concrete/fixed/un hidden class

 */