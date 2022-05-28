package controlFlow;

public class Operators {
//     unary -> -10 , here - is unary operator & in x++ its postfix
//    binary -> a + b
//   ternary ->  always uses only ?:  | x>2 ? 1 : 0
//    compound operators -> += , -= ..
// Operator precedence .
//    *,/,% ( multiplicative )  > - , + ( additive )
//    ! > arthimatic  > comparision > && , || | So keep && , || in between ().
// Operator promotion
//    operands smaller than int are promoted to int.
//    same type operations rule :  a/b will be an int only .
    static int a = 10;
    static int b = 20;
//mix type operations rule -> values are promoted to longer type
//    int > long > float > double.
    static float c = 30;
//Short circuit Operators. ~ , && , ||
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// conditional and   && -> If left is false , returned false right is not evaluated
// prevent null pointer exception ====> (a == null && b > 30)
// conditional or    || -> if left is true ,  returned true

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~



    public static void main(String[] args) {
        System.out.println((a/b) * c); // (int 10/int 20) = int 0 | 0 * 30.0 = 0.0
    }




}
