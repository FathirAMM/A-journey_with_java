package LearnJavapkg1;
class a{
    a(){
        System.out.println("a");
    };//a default constructor created
    a(int i){
        System.out.println("i,a");
    };//new constructor created
}//new class created
class b extends a{
    b(){
        System.out.println("b");
    };//new constructor created
    b(int i){
        super(i);
        System.out.println("i b");
    }//new constructor created
}//new class created




public class SuperKeyWordClass18 {
    public static void main(String[] args) {
        System.out.println("This lesson is about super keyword");
        b obj=new b(10);//new object created
    }
}
