package basics;

import basics.dtypes.Student;

import java.util.Arrays;

public class Arrayzs {
    // Container OBJECT that holds fixes number of values of single type.
    int[] nonstatic = new int[3]; // this is nonstatic , so cant use it in static main method.
    static int[] arr2;// static object can be used in  main method which is static. this is null as its not initialized.
    public static void main(String[] args) {
        int[] directinitialize = new int[] {1,2,3,4}; // direct initialization.
        int[] initialize_auto = {1,2,3,4}; // another type of  initialization.
        System.out.println(arr2); // Prints null
//        System.out.println(arr2[0]); // NullpointerException
//         We can initialize it now.
        arr2 = new int[3];
        Student[] st1 = new Student[10]; // we have initialized to 10
        System.out.println(st1[1]);  // outputs null as there is no object.
        System.out.println(" size of array " +arr2.length);
        Student[] st = {new Student(),new Student(),new Student()}; // for small lengths
        System.out.println(st[0]);


    }


}
