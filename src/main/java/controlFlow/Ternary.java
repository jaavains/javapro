package controlFlow;

public class Ternary {

    public static void main(String[] args) {


        int small = 10;
        int large = 20;

// this doesnt work , as ternary  is not an expression statement , ending with ;
//        large < small ? true : false ;
//this works as we are assigning it to a variable.
        boolean facts = large < small ? true : false ;
//     If operands belong to different types, then smaller type is promoted to larger type.
        double result = true ? 12 : 0.5 ;

    }
}
