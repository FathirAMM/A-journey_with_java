package LearnJavapkg1;
class a1{
    void display(){
        System.out.println("a1 class");
    };//new method created

}//new class created
class b1 extends a1{
    @Override//this annotation used to avoid type error when overriding
    void display(){
        System.out.println("b1 class");
    };//new method created

}//new class created

public class OverrideClass19 {
    public static void main(String[] args) {
        System.out.println("This lesson is about method Override");
        b1 obj=new b1();
        obj.display();//child class has more power
    }
}
