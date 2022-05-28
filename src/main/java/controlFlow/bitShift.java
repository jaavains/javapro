package controlFlow;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class bitShift {
//    <<   left shift             multiplying by 2^2
//    >>   signed right shift  ,  division  by 2^2
//    >>>  unsigned right shift   division  by 2^2

    public static void main(String[] args) {
        int a = 6;  // 000000000000000110
        System.out.println(a << 2);   // multiplying by 2^2 = 6  * 4 = 24
        System.out.println(a >>> 2);   // division  by 2^2 = 6  /  4 = 1
        System.out.println(-a >>1);   // 1 showing -ve at beginning will be preserved and rest will be replaced by 1.

    }

}
