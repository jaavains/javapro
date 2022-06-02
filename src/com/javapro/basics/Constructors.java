package basics;

public class Constructors {
// Constructor main purpose is to state of the objects created , with no return value.
// Student s = new Student()
//  LHS :  Allocate space for reference variable s;
//  RHS : Create a new object by calling a constructor.

    int a;
    int b;

    private Constructors() {
        this(100, 300);    // call to this() must be first statement in any constructor & only 1.
//        this(a);    Cannot reference 'Constructors.a' before supertype constructor has been called
    }

    private Constructors(int a, int c) {
        this.a = a;   // a is shadowed here so , we use this.a
        b = c; // as there is no shadowing on b , we need not use this. here.
    }


    public static void main(String[] args) {
        Constructors c = new Constructors();

        System.out.println(c.a * c.b);
    }


}
