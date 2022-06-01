package exercises.ex3;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StudentUtil {

    public static double[] calculateGPA(int[] studentIdList, char[][] studentsGrades) {
        double[] GPA = new double[studentIdList.length];
        for (int i=0;i<studentIdList.length;i++){
            double gpaTotal = 0.0;
            for(char c:studentsGrades[i]){
                gpaTotal+=(69-c);
            }
            GPA[i] = gpaTotal/(studentsGrades[i].length);
        }
        return GPA;
    }


    public static int[] getStudentsByGPA(double lower, double higher, int[] studentIdList, char[][] studentsGrades) {
        if ((lower <0.) && (higher<0.) && (lower > higher)){
            return null;
        }
        double[] calGPA = calculateGPA(studentIdList,studentsGrades);

        return IntStream
                .range(0,studentIdList.length)
                .filter(i -> ( (calGPA[i] > lower) && (calGPA[i] < higher)  ) )
                .map( x -> studentIdList[x]).toArray();


        // construct the result array and return it. You would need an extra for loop to compute the size of the resulting array

    }


    public static void main(String[] args) {
        for(Object d : getStudentsByGPA(1.0,3.5,new int[]{1001, 1002},new char[][]{ { 'A', 'A', 'A', 'B' }, { 'A', 'B', 'B' } })){
            System.out.println(d);
        }
    }


}