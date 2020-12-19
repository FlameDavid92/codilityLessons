package it.davide.lesson3;

import java.util.Arrays;

public class PermMissingElem {
    public static int solution(int[] A){
        int expected = 1;
        int[] B = A.clone();
        Arrays.sort(B);
        for (int i : B){
            if(expected == i) expected++;
            else return expected;
        }
        return expected;
    }
}
