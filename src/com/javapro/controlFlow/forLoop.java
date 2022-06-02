package com.java.controlFlow;

public class forLoop {

//    with in for() we have 3 'expressions'
//  1. initialization expression | like int i = 0; | Executed only once.
//  2. condition-expression  | Executed multiple times
//  3. expression-list seperated byt , | Executed multiple times & also includes i++


    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
//  int i =0 , j= 10 only works , int i =1 , int j =20 doest work.
        for (int i = arr.length - 1; i >= 0; i -= 2) {
            System.out.print(i);
        }
        System.out.println("\n--------------------------------------------------------------------");

// reverse the Array
//
        for (int i = 0, j = arr.length - 1, middle = (arr.length / 2); i < middle; i++, j--) { // arr.length is calculated always if its in middle!
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
// in expression-list , ie,. 3rd part we can have multiple items or
// we can also include increment inside another expression also !
        for (int i = 0; i < arr.length; System.out.print(arr[i++] + "<-")) ;
//     we can put ; at end to mention its complete.


        int[][] grades = {{10, 20, 88, 29}, {2, 233, 23232, 323}, {2222222, 233, 23232, 323}};

        for (int i = 0, gradesLen = grades.length; i < gradesLen; i++) {
            int maxElement = 0;
            for (int j = 0, stuLen = grades[i].length; j < stuLen; j++) {
                maxElement = maxElement > grades[i][j] ? maxElement : grades[i][j];
            }
            System.out.printf("\nmaximum of this group %d is % d", i, maxElement);
        }


    }
}
