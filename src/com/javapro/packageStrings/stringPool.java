package packageStrings;
// String pool is also called as String Table
// Building a string pool is called string interning.
public class stringPool {
    // In a statement of String s = "avinash" ,
// first a new string object is created and intern() is invoked.
// (string is in String pool) ? return reference  : add this to string pool and return it.
    public static void main(String[] args) {
        String s1 = "insideStringpool"; // this is in string pool
        String s2 = "insideStringpool"; // s1 ,s2   reference same object;
        System.out.println(s1 == s2);  // true as they are in StringPool
        String s3 = new String("insideStringpool"); // this is new object outside Stringpool but the object is a  reference to s2 in stringpool !
        System.out.println(s1 == s3); // false , as object reference is different.
        String s4 = "insideStringpoo";
        String s5 = s4 + "l";  // this creates an object outside string pool.
        System.out.println(s3 == s5);  // false
        s5 = s5.intern(); // this makes s5 refer the object in string pool . But better dont try ,let jvm take care. May work in NLP !
        System.out.println(s1 == s5); // true

        String sc = "hello" + "world " + 100 + 25.0; // evaluated from left to right.
        System.out.println(sc); // helloworld 10025.0
        String sc2 = 100 + 25.0 + "hello" + "world ";
        System.out.println(sc2); // 125.0helloworld    }

/*    Why are strings immutable ?
   1. for interning.

*/


    }
}