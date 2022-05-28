package basics.dtypes;

public class Student {
    int a;
    String name,cls,school;
    public static String schooled = "DCPS"; // if not public , classes outside dtype package cannt see this Class.

    public Student(){}
    public Student(String name,String cls,String school){
        this.name = name;
        this.cls = cls;
        this.school = school;

        return; // we need not use a return but when we use if we can break it.
    }

    public void compute(){

        System.out.println("Un-initalized variable at class level is set to " + a);
        System.out.println("But , We need to initialize variable in a method" + a);
    }

    public void updateSchool(){
        school = "NEWDCPS";
    }
}
