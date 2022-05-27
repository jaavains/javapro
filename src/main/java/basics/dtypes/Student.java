package basics.dtypes;

public class Student {
    int a;
    int b = a+1;  // expression.

    void compute(){

        System.out.println("Un-initalized variable at class level is set to " + a);
        System.out.println("But , We need to initialize variable in a method" + a);
    }


}
