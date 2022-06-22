package LearnJavapkg1;

public class StringClass4 {
    public static void main(String[] args) {
        String NameString1="java programme";//strictly S is uppercase in String
        System.out.println(NameString1);
        String NameString2="Java"+" "+"Python";//concatenation
        String NameString3="    qwerty";
        System.out.println(NameString2);
        System.out.println(NameString1.toUpperCase());
        System.out.println(NameString2.toLowerCase());
        System.out.println(NameString3.trim());
        System.out.println(NameString1.startsWith("j"));
        System.out.println(NameString1.endsWith("me"));


        //unchangable constants
        final int a=10;
        //a=11; this code will generate error since variable a is fixed


    }
}
