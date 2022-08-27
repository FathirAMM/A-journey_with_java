//What is Abstraction?

abstract class Member{
    private String name;
    abstract void welcomeMessage();//abstract method , abstract method doesn't have any body part
    void sleep(){//regular method or concrete method
        System.out.println("zzzzzzzzzzzz");
    }
    
    Member(){
    	
    }//we can create constructor for abstract class , but can not create object
}

class Students extends Member{
    @Override
    void welcomeMessage(){
        System.out.println("Hello students !");
    }
}

class Teacher extends Member{
    @Override
    void welcomeMessage(){
        System.out.println("Hello Teachers !");
    }
}
public class _10_Abstraction_OOPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s1=new Students();
        Teacher t1=new Teacher();
        //Member m1=new Member(); Can not create object for abstract classes
        Member me=new Students();// this is ok


        Member[] m=new Member[4];//this is possible
        m[0]=new Students();
        m[1]=new Students();
        m[2]=new Teacher();
        m[3]=new Teacher();

        for(Member m1:m){
            m1.welcomeMessage();
        }


	}

}

/*
What is Abstraction?
opposite of abstraction is concrete.
concrete:-Refers to physical object in Real World
eg:-3finger+2finger=?finger
Abstract:-Idea or concept that does not exist physically in real world
eg:- 3+5=?

Abstract class is a common class

Abstraction is a process of hiding the implementation details from the user,
only the functionality will be provided to the user.
In other words user will
have the information on what the object does instead of how it does it

A class which contains the ‘abstract’ keyword in its declaration is known as
abstract class and may or may not contain abstract methods

But, if a class have at least one abstract method, then the class must be
declared abstract

If a class is declared abstract it cannot be instantiated.(can not create object for abstract class)
• If you inherit an abstract class you have to provide implementations to all
the abstract methods in it.

We can create constructors for abstract classes

Abstract method cannot have body
 */
