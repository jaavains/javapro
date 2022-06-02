package basics;

import basics.dtypes.Student;

public class Variables {
    static int ss; // class variables    : specific to the class & global across all classes. s
    int a;       // instance variables. : specific to object instance
    long l1 = 100;
    int i1 = (int) l1;   // narrowing type conversion. we need to explicitly cast.
    // compiler doesnt know that its smaller ,as its known at runtime.
    // so casting should be done.
    long l2 = i1; // auto casting .
    double d1 = (2 + 3) / 2;  // outputs an int. 2.0
    double d2 = (double) (2 + 3) / 2; // outputs a double. 2.5

    public static void main(String[] args) {
        Student s1 = new Student();          // Static String school = "DCPS";
        System.out.println(Student.schooled);  //  Static variables can be accessed from class itself.
        s1.updateSchool();                   //  Updates Class's variable.
        System.out.println(Student.schooled);  //
    }

    void methodVariable() {
        Student s; // local variables    : scope is only inside method.
    }


}
