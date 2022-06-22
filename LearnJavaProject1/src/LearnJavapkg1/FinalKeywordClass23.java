package LearnJavapkg1;

class Cons{
    final void display(){
        int i=100;
        System.out.println("100");
    }


}//new class created
class Ok extends Cons{

}//new class created

public class FinalKeywordClass23 {
    public static void main(String[] args) {
        System.out.println("final key word");
        Ok obj=new Ok();
        obj.display();



    }
}
/*
final means fixed
final can be used for class,method,variables
 */