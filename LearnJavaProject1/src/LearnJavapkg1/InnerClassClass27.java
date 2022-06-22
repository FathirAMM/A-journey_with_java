package LearnJavapkg1;

class s1{
    void s1m(){
        System.out.println("s1m");
    }
    class s2{
        void s2m(){
            System.out.println("s2m");
        }

    }
}

public class InnerClassClass27 {
    public static void main(String[] args) {
        System.out.println("Inner class");
        s1 obj=new s1();
        obj.s1m();

        s1.s2 obj1=obj.new s2();
        obj1.s2m();
    }
}
