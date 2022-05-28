package basics;
import java.lang.System;
public class Methods {
// return type is not signature of a method , its only name & parameters !

// java is always pass by value in methods
//        a COPY of corresponding value is passed. Its value itself in primitives & address for objects
// Primitives are stored as <id> = memoryAddress of  actual value.
//        As per  passby value : copy of corresponding value which is the value itself is passed.
// Object reference   <student1> =  memoryAdress of Student object , inturn points to  memory address of actual student
//        As per passby value : | copy of corresponding value ( which is address ) is passed.

    int salary = 100;
    double bonus;
    // Static methods are utility methods. shared across different objects of same class.
     static double addition(double a,double b){
        return  a+b;
    }
     void updateSalary(Integer s){
         s = 500;
    }
    public static void main(String[] args) {
        System.out.println(addition(1.0,2.));
        Methods md = new Methods();
        System.out.println("Initial salary ="+md.salary);
        md.updateSalary(md.salary);
        System.out.println(" Salary  after update ="+md.salary); // as we are passing primitives.
    }






}
