package basics;

public class day1 {
// JAVA Is statistically typed language.
    int c = 10;  // declaration statements can appear anywhere in the class & initialization is optional at class level.
    //
    // c  = 20 ;   // Assignments cannot appear at class-level they can appear inside methods..
    public static void main(String[] args) {
        // literals are raw data.
        int a = 10;             // primitive variable
        Student st = new Student() ; // object reference as its an object
        String s = "avin";      // so  object reference | String is a class

        // expressions -> evaluated to single value.
        int b = a + 10;
        System.out.println("Avinash hello! !!");
    }
}


