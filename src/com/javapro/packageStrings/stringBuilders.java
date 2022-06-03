package packageStrings;

import java.sql.SQLOutput;

public class stringBuilders {
//     String builder is mutable.
//     Is not synchronized , so simultanious modifications cannot happen .

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append(":").append("avin").append(12.0).append("ash");
        System.out.println(sb);
        System.out.println(sb.reverse()); // reverse
        System.out.println(sb.reverse().delete(5,9));

//         Escape characters :
        System.out.println("hello\"s '");


    }
}
// StringBuffer --> older api , but synchronized , so it slows down the execution as any time 1 thread modifies the object.