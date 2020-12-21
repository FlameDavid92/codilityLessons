package it.davide.lesson6;

import java.util.Arrays;

public class MaxProductOfThree {
    public static int solution(int[] A) {
        int len = A.length;
        Arrays.sort(A);
        int max = A[len-3] * A[len-2] * A[len-1];
        if(len == 3) return max;
        else if(A[len-1] < 0) return max;
        else if(A[0] < 0 && A[1] < 0){
            int c = A[0] * A[1] * A[len-1];
            return Math.max(c,max);
        }else return max;
    }
}
