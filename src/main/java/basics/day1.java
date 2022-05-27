package basics;

import basics.dtypes.Student;

public class day1 {
// JAVA Is statistically typed language.
//1.    We can leave assiging at class level ( defaults to 0 for int ) , but it should be done in method.
//2.   We should assign at method level.

    int c = 10;  // declaration statements can appear anywhere in the class & initialization is optional at class level.
    //
    // c  = 20 ;   // Assignments cannot appear at class-level they can appear inside methods..

    static void statMethod(){
        System.out.println("Static method can be called directly with out object creation.");
    }
    public static void main(String[] args) {
        statMethod();
        // literals are raw data.
        int a = 10;             // primitive variable
        Student st = new Student() ; // object reference as its an object
        String s = "avin";      // so  object reference | String is a class

        // expressions -> evaluated to single value.
        int b = a + 10;
        System.out.println(Long.MAX_VALUE);
        int aBinary = 0b1001;
        int aHex = 0x100;
        System.out.println(String.format("aBinary = %d | aHex = %d ", aBinary,aHex));
    }
}


