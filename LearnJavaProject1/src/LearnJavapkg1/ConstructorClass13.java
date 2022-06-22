package LearnJavapkg1;
//===========CAR CLASS BLOG=========//
class Carr{
    int speed;
    String color;
    //===============constructor(default constructor)
    Carr(){
        speed=0;
        color="white";

    }
    //===============constructor(default constructor)
    //reduce code using constructor by applying parameter
    Carr(int s,String c){
        speed=s;
        color=c;
    }
    //reduce code using parameter constructor by applying parameter
    //=========more on constructor
    Carr(int i){
        speed=i;
        System.out.println("single parameter constructor activated");
    }
    //=========more on constructor

    void run(){
        System.out.println("CAR is Running");
    }//method


}
//===========CAR CLASS BLOG=========//
public class ConstructorClass13 {
    public static void main(String[] args) {
        Carr audi=new Carr();//define new object
        audi.color="red";
        audi.speed=256;
        System.out.println(audi.color+" "+audi.speed);
        audi.run();


        Carr bmw=new Carr();//define new object
        bmw.color="blue";
        bmw.speed=300;
        System.out.println(bmw.color+" "+bmw.speed);
        bmw.run();


        Carr tesla=new Carr();//default value constructing
        System.out.println(tesla.color+" "+tesla.speed);
        System.out.println("Default constructor activated");


        Carr benz=new Carr(250,"maroon");//code reduce using parameter constructor
        System.out.println(benz.color+" "+benz.speed);


        Carr vega=new Carr(300);//passing 1 parameter
        System.out.println(vega.speed);
        System.out.println(vega);//when run object will print memory address


    }
}
/*
if we do not specify value of speed it will automatically
specify value(Construct value)
There are some properties for constructor
//class name is constructor name:Carr
//Usually constructor used to specify default value
//parameterized constructor can be used to reduce code

 */