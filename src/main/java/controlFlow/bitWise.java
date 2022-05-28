package controlFlow;
// bitwise &, | and ^ when applied on 'boolean operands' are referred to as logical operators and not bitwise.
// In other words, the operators &, |, ^, ~ are referred to as bitwise ONLY when they are applied on integer operands
public class bitWise {
//     bitwise and &  ( single ampersand ) if both input bits are 1 , it outputs 1.
//     1 & 3  = 1
//    bitwise |  => If either is 1 , we get a 1.
//     1 | 3 = 3
//    bitwise ^ XOR => If only either of them equals 1.
//     1 ^ 3 = 2
//    bitwise not ~  -> It inverts bits.
//              Bitwise NOT (~) will not even compile with boolean.
//              If we need such a behavior, then we would use logical NOT (!) operator.
//    These are not short circuits so , both operands are evaluated.
//     Compoundings:
//     a &= b

    public static void main(String[] args) {
        int a = 3;
        int b = 1;
        boolean b1 = false;
        boolean b2 = true;
        System.out.printf(" & in between booleans gives another boolean : %s \n" ,b1 & b2 );
//         & in between booleans gives another boolean : false
        System.out.printf(" & in between int values is bitwise giving another int  : %s" ,a & b );
//        & in between int values is bitwise giving another int  : 1
    }


}
