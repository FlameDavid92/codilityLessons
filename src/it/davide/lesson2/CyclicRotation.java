package it.davide.lesson2;

public class CyclicRotation {
    public static int[] solution(int[] A, int K) {
        int len = A.length;
        if(len == 0 || len == 1) return A.clone();
        int utK = K%len;
        if(utK == 0) return A.clone();
        int[] ret = new int[len];
        for(int i=0; i<len; i++){
            ret[(i+K)%len] = A[i];
        }
        return ret;
    }
}
