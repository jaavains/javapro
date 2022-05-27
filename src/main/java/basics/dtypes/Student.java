package basics.dtypes;

public class Student {
    int a;
    public static String school = "DCPS"; // if not public , classes outside dtype package cannt see this Class.
    int b = a+1;  // expression.

    public void compute(){

        System.out.println("Un-initalized variable at class level is set to " + a);
        System.out.println("But , We need to initialize variable in a method" + a);
    }

    public void updateSchool(){
        school = "NEWDCPS";
    }
}
