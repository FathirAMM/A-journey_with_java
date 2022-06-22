package LearnJavapkg1;

public class OperatorsClass5 {
    public static void main(String[] args) {
        byte num1=10;
        byte num2=2;
        System.out.println(num1+num2);//(+,-,/,*,%)
        System.out.println(num1>=num2);//(>,<,>=,<=,==,!=)
        byte num3=3;
        num3+=10;//num3=num3+10//(-=,*=,/=,%=)
        System.out.println(num3);

        //logical operators (&&,||,!)
        int ageOfPerson=28;
        boolean citizen=true;
        System.out.println(ageOfPerson == 18 && citizen == true);


        //special operator (? :)
        String name=ageOfPerson>=18 ? "eligible":"not eligible";
        System.out.println(name);


        //increment
        byte num4=4;
        num4++;//post increment(-- post decrement)
        System.out.println(num4);
        byte num5=5;
        System.out.println(num5++);//first print then increase
        byte num6=6;
        System.out.println(++num6);//first decrease then print

        //warning 1
        byte num7=7;
        int num8=num7++;
        System.out.println(num7);//8
        System.out.println(num8);//7
        //warning 2
        byte num9=9;
        int num10=++num9;
        System.out.println(num9);//10
        System.out.println(num10);//10




        //using math class
        int a=100;
        float b=102.5f;
        System.out.println(Math.abs(b));
        System.out.println(Math.max(5,4));






    }
}
/*

 */