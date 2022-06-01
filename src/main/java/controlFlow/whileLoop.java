package controlFlow;

import java.util.stream.IntStream;

public class whileLoop {
    static void firstNprimes(int count) {
        int i = 0;
        int end = 2;
        while (i < count) {
        for (int j=2;j < end;j++){
            if ((end%2)==0){
                end+=1;
                break;
            }
        }
            System.out.print(end+" ");
            i+=1;
            end+=1;
        }
    }
    public static void main(String[] args) {
        firstNprimes(10);
        }
}
