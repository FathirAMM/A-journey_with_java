package LearnJavapkg1;


import LearnJavapkg1.New.ImportClass24_3;//importing

public class ImportClass24 {
    public static void main(String[] args) {
        System.out.println("import");

        ImportPart2Class24_2 obj=new ImportPart2Class24_2();//this class in another file
        obj.display();
//this will work only if both file in same package
        //if ImportPart2Class24_2 is private class ,we cant do this
        ImportClass24_3 obj1=new ImportClass24_3();//this class is in another package
        obj1.display1();



    }
}
//empty-not accessible in other pkg
//public-can use anywhere
//private-only in that class
//protected-only in that pkg