package packageStrings;
// StringUtils from google guave / apache commonds  can also be used.
public class string {
    public static void main(String[] args) {

        String s1 = new String("hello") ; //  "hello" is an object reference of String literal which is a string object
        String s2 = new String(new char[]{'l','o'}); // internally strings is immutable sequence of char arrays. using utf-16

//         Recommended way for optimizations is via string literal below that saves strings in String pool.
//         Same string in String pool will have same objectID saving space .
        String sbetterApproach = "avinash"; // "avinash" is string literal ,. This works for strings & box primitives.
        System.out.println(s1.isEmpty()); // is string empty ?
        System.out.println(s1.equalsIgnoreCase(s2)); // true
        System.out.println(s1.compareTo(s2));  // Compares lexicographically. | 0 when matching
        System.out.println(s1.contains("lo"));
        System.out.println(s1.endsWith("o"));
        System.out.println(s1.lastIndexOf("o")); // when o occurs more times , this helps.
        System.out.println(s1.substring(2)); // from 2 till end.
        System.out.println(s1.toLowerCase());  //  a new string object is returned.
        System.out.println(s1.replaceAll("h","W")); // replaceAll is for regex.
// Static method from String
        System.out.println(String.valueOf(19.0));

//
        String longString = "This string is very long.";
        String other = "This string" + " is " + "very long.";   // both are same.

        String is = " is ";
        String others = "This string" + is + "very long.";     // longString & this are not same because it uses a variable


    }
}
