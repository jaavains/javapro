package basics;

import basics.dtypes.Student;

public class Variables {
    static int ss; // class variables    : specific to the class & global across all classes. s
    int a ;       // instance variables. : specific to object instance

    public static void main(String[] args) {
        Student s1 = new Student();          // Static String school = "DCPS";
        System.out.println(Student.school);  //  Static variables can be accessed from class itself.
        s1.updateSchool();                   //  Updates Class's variable.
        System.out.println(Student.school);  //
    }

    void methodVariable(){
        Student s; // local variables    : scope is only inside method.
    }




}
