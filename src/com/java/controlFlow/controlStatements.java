package controlFlow;

public class controlStatements {

    static int days;

    static String ifelse(int a, int b) {
        if (a > b) return "avinash";
        else return "no";
//        return null;   // unreachable statement.
    }

    public static void main(String[] args) {
        System.out.println(ifelse(33, 334));
        final int a = 0;
        int b;

//              switch -- case .
        // Only works with 'one' condition to test & condition being a equality one. If not use if-else.
// expression can be only of : Integer , String , enum
// a compile time constant can be used in case. use final its outside scope of switch-case.
//case label cannot be null.
// It  must be a constant variable ' within scope of switch'. Even method arguments are outside of case scope.
//  we can use a final int a = 0 , which should be a compile time constant.

        switch (days) { // expression can be only of : Integer , String , enum

// a compile time constant can be using in case.
// Only works with one condition to test & its a equality one.
//case label cannot be null.
// It  must be a constant variable ' within scope of switch'. Even method arguments are outside of case scope.
//  use a final int a = 0 , which should be a compile time constant.
            case a: //  use a final int a = 0 , which should be a compile time constant.
                System.out.println("avinash");
                b = 100;
                break;
            default:   // default switch type..
                System.out.println("Monday");
        }
    }
}
