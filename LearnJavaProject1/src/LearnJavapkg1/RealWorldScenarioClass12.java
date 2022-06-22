package LearnJavapkg1;

//===========CAR CLASS BLOG=========//
class Car{
    int speed;
    String color;
    void run(){
        System.out.println("CAR is Running");
    }

}
//===========CAR CLASS BLOG=========//

public class RealWorldScenarioClass12 {
    public static void main(String[] args) {
       Car audi=new Car();//define new object
        audi.color="red";
        audi.speed=256;
        audi.run();
       Car bmw=new Car();//define new object
        bmw.color="blue";
        bmw.speed=300;
        bmw.run();
    }
}
