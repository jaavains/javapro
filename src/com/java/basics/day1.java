package basics;

import basics.dtypes.Student;

public class day1 {
    static String classVariable; // static in a class makes it accessible directly like day1.classVariable.
    // if is also a statement.
    // updateValue() ; --> expression statement.
    static Student s1;  // this gives null pointer.
    public String pubStr; // public can be accessible outside of package also.
    // expression is something that  gets evaluated to single value.
    // Statement is  a command to execute that ends with ;
    int zz = 2 * 23;
    int a;    // we need not initialize in a class , they become instance variables.

    public static void main(String[] args) { // '{' means multiple statements and dont need a ; !
        int a = 100; // here we should initialize also.
        int b = (int) 100L; // we should always cast when coming down from large to small objects
        System.out.println("8 primitive types are present .");
        s1.updateSchool(); // null pointer exception.
    }


}
