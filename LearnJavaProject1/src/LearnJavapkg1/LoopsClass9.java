package LearnJavapkg1;

public class LoopsClass9 {
    public static void main(String[] args) {
        //for loop,while loop, do while loop, for each loop

        //for loop
        for (int initial=0 ; initial<5; initial++) {
            System.out.println("JAVA");
        }
        for (int initial=6 ; initial>0; initial--) {
            System.out.println("Hi dude");
        }



        //while loop
        int number=3;
        while(number>0){
            System.out.println("Hi mate");
            number--;
        }





        //do while
        int number1=3;
        do {
            System.out.println("Hi raj");
            number--;
        }
        while (number1>0);

        /*
        while loop, do while loop doing same job but there is a difference
        while work only condiotion met
        do while work atleast once whether or not condion met or not
         */
        //while loop
        int number2=3;
        while(number2>10){
            System.out.println("Hi karthik");
            number2--;
        }

        //do while
        int number3=3;
        do {
            System.out.println("Hi moorthi");
            number3--;
        }
        while (number3>10);
        /*
        while loop, do while loop doing same job but there is a difference
        while work only condiotion met
        do while work atleast once whether or not condion met or not
         */






        //for each loop//specially for array
        String vegetables[]={"beans","carrot","leeks"};
        for (int i=0 ;i<vegetables.length;i++){
            System.out.println(vegetables[i]);
        }
        //

        for (String vegetable:vegetables){
            System.out.println(vegetable);
        }









    }
}
