package basics;

public class Student {

    int a;
    int b = a+1;  // expression.

    void compute(){

        System.out.println("Un-initalized a from class " + a);
        System.out.println("We need to initialize variable in a method" + a);
    }

    public static void main(String[] args) {
        Student s = new Student();

        s.compute();
    }


}
