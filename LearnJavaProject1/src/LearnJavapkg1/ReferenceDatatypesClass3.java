package LearnJavapkg1;

import java.util.Arrays;// this package will be automatically inported when we define arrays

public class ReferenceDatatypesClass3 {
    public static void main(String[] args) {
        //Create an int array approach1(Not recommended)
        int[] array1=new int[4];//[] tells to create an array, new is a keyword,also have to specify the size
        int array2[]=new int[4]; //[] can put after array name
        array1[0]=10;array1[1]=11;array1[2]=12;array1[3]=13;
        array2[0]=10;array2[1]=11;array2[2]=12;//if value not assigned it will take 0 value for index
        System.out.println(array1);//this code work but not print array
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(array1[1]);//to call value using index, can use simple println



        //Create an int array approach2
        int array3[]=new int[]{10,11,12,13,14};//create array without specify size
        int array4[]={10,11,12,13};//recommended and simple method
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));



        //Create an char array
        char array5[]={'a','b','c'};
        System.out.println(Arrays.toString(array5));
        int len=array5.length; //len is a variable ,length to find size
        System.out.println(len);
        char array6[]=array5.clone();//get a copy of an array
        System.out.println(Arrays.toString(array6));



        //multi dimensional array
        int array7[][]={{1,2},{3,4}};
        System.out.println(Arrays.deepToString(array7));

        //NOTE
        int number=10;//primitive data type doesnt have methods
        String name=new String("Karthik");//reference data type have methods
        System.out.println(name.length());//length is a method



    }
}
/*
There are 3 types of reference data types:array,class,interface
 */