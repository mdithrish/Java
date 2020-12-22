package math;
import java.util.*;

public class ArrayProblem {

        public static int diagonalDifference(List<List<Integer>> arr) {

            int n = arr.size();
            int acount=0,bcount=0;

            for (int i=0; i<n; i++){
                acount= acount + arr.get(i).get(i);
                bcount = bcount + arr.get(i).get(n-i-1);
            }
            return Math.abs(acount - bcount);

        }

    static int minimumAbsoluteDifference(int[] arr) {
        Arrays.sort(arr);

        int minimum= Integer.MAX_VALUE;

        for(int i=0; i<arr.length-1; i++){
            int difference = arr[i + 1] - arr[i];

            if(difference < minimum){
                minimum = difference;
            }


        }
        return Math.abs(minimum);
    }

}
