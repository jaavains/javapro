package controlFlow;

import java.sql.Array;
import java.util.Arrays;

public class binarySearch {


    static boolean bsearch(int[] arr,int value){

        if (arr.length>0){
            int midValue = arr.length/2;
            if (value == arr[midValue]) {
                return true;}
            else if (value<arr[midValue]){

                return bsearch(Arrays.copyOfRange(arr,0,midValue),value);
            }
                else {
                    return bsearch(Arrays.copyOfRange(arr,midValue+1,arr.length),value);

                }

            }

        return false;
    }


    public static void main(String[] args) {

        System.out.println(bsearch(new int[]{1,2,3,4,9,10,22,34},34));


    }
}
