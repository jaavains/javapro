package basics;

import basics.dtypes.Student;

import java.math.BigDecimal;

public class basics {
// JAVA Is statistically typed language. Once we define a type, we can only assign values of that type.
//1.    We can skip assignment at class level ( defaults to 0 for int ) , but it should be done in method.
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
//                                   Varialble is of 2 types , primitive / object type.
        int a = 10;                  // primitive variable
        Student st = new Student() ; // object reference as its an object
        String s = "avin";           // object reference as String is a class

        // expressions -> evaluated to single value.
        int b = a + 10;
        System.out.println(Long.MAX_VALUE);
        int aBinary = 0b1001;
        int aHex = 0x100;
        System.out.println(String.format("aBinary = %d | aHex = %d ", aBinary,aHex));
        System.out.println(3.8e4);   // 38000.0
        System.out.println( 1 - .9 ); // 0.09999999999999998 | Binary floating format ,so .0 and all cann't be accurately represented
        BigDecimal bg = BigDecimal.valueOf(1);  // Use for money
        System.out.println(bg.subtract(BigDecimal.valueOf(.9)));
        System.out.println(1 - 0.13 ); // Issue is because denominator is not power of 2 !


    }

}


