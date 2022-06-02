package basics;

import java.util.Arrays;

public class Methods {
// return type is not signature of a method ,. Signature is  only name & parameters !

// Java is always pass by value in methods
//        a COPY of corresponding value is passed. Its value itself in primitives & address for objects

// Primitives are stored as <id> = memoryAddress of  actual value.
//        As per  passby value : copy of corresponding value which is the value itself is passed.
// Object reference  <student1> =  memoryAddress of Student object , inturn points to  memory address of actual student
//        As per passby value : | copy of corresponding value ( which is address ) is passed.

    int salary = 100;
    double bonus;

    // Static methods are utility methods. shared across different objects of same class.
    static double addition(double a, double b) {
        return a + b;
    }

    static double addition(int a, int b) {  // static methods also can be overloaded.
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(addition(1.0, 2.));
        Methods md = new Methods();
        System.out.println("Initial salary =" + md.salary);
        md.updateSalary(md.salary);
        System.out.println(" Salary  after update =" + md.salary); // as we are passing primitives.
        md.varArgs();   // when varargs has no inputs , compiler sends an empty array.
        md.varArgs(1, 2, 3);   // vargars sends an array of . {1,2,3}
        System.out.printf("%d , %d , %d", 1, 2, 3); // 'printf' takes a string & varargs.
        // varargs will be matched at last after searching for other overloaded methods !
    }

    // overloading method means two method will have difference only in parameters . public, static  is immaterial.
    void updateSalary(String s) {
        s = "100";
    }

    void updateSalary(Integer s) {  // return type is immaterial in method overloading.
        s = 500;
    }

    void varArgs(int... varint) {  // varargs are type followed by ...
        if (varint.length == 0) {
            System.out.println("Empty array sent");
        }
        Arrays.stream(varint).forEach(System.out::println);  // varargs are type of Arrays.
    }


}
