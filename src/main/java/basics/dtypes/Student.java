package basics.dtypes;

public class Student {
    int a;
    public static String school = "DCPS"; // if not public , outside package of dtypes cant see this.
    int b = a+1;  // expression.

    public void compute(){

        System.out.println("Un-initalized variable at class level is set to " + a);
        System.out.println("But , We need to initialize variable in a method" + a);
    }

    public void updateSchool(){
        school = "NEWDCPS";
    }
}
