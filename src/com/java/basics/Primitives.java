package basics;

public class Primitives {
    // here digits are the bits for each type.
    byte b = 8;    // All are in bits
    short s = 16;  // Range - 2^15 to 2^15 -1
    int i = 32;   // All are integer types and default to 0 .
    long l = 64L;  // Left most bit which is the most significant bit is a sign bit , and it tells if its +ve / -ve
    // we only have two number literals :  int  like 100 , or long like 100L | . A number literal is   an int.
    int und = 100_100; // underscores can occur.
    // All primitives has box primitives . For int its Integer.

    float f = 32.0f;  // 6-7 digit precision  . By default its double , we should include a f !
    double d = 64.0;  // 15-16 digit precision. | 3.8e4 = 38000.0 | in 64 bits , 1 is for sign, 11 are for exponent , 52 for fractional part.

/*
*
*Precision is the total number of digits (or significant digits) of a real number.
Scale specifies the number of digits after the decimal place.
* For example, 12.345 has the precision of 5 (total digits) and the scale of 3 (number of digits right of the decimal).
* */


    char bb = 'B';     // 16 digit unsigned.  2^16 -1 = 65536 .
//   char is stored as utf-16 , defaults to null.
//    B -> 0042 -> 0000 0000 0100 0010   | 66  | \u0042 <- unicode hexadecimal

    char cc = 99;  // can assign a value between 0 -  65536

    boolean bol; // default is false. Since its inside a class ,we need not initialize also.


}