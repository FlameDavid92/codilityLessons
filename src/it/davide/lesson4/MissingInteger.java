package it.davide.lesson4;


import java.util.ArrayList;
import java.util.Arrays;

public class MissingInteger {
    public static int solution(int[] A) {
        ArrayList<Integer> B = new ArrayList<>();
        for (int j : A) {
            if (j > 0) B.add(j);
        }
        B.sort(Integer::compare);

        if(B.size() == 0 || B.get(0) != 1) return 1;
        for(int i=1;i<B.size(); i++){
            if(i+1 < B.size()){
                int temp = B.get(i+1) - B.get(i);
                if(temp != 0 && temp != 1) return B.get(i)+1;
            }
        }
        return B.get(B.size()-1)+1;
    }

    public static int solution2(int[] A) {
        Arrays.sort(A);
        if(A[A.length-1] <= 0) return 1;
        if(A[0] > 1) return 1;
        for(int i=0; i<A.length; i++){
            if(i+1 < A.length){
                if(A[i]<0 && A[i+1] > 1) return 1;
                else if (A[i]>0){
                    int tmp = A[i+1]-A[i];
                    if(tmp != 0 && tmp != 1) return A[i]+1;
                }
            }
        }
        return A[A.length-1]+1;
    }

    /*Soluzione che preferisco! 100% (Att inserisci Java11)*/
    public static int solution3(int[] A) {
        int[] B = Arrays.stream(A).filter(i -> i>0).sorted().distinct().toArray();
        if(B.length == 0) return 1;

        int ret = 1;
        for (int j : B) {
            if (j == ret) ret++;
            else return ret;
        }
        return ret;
    }
}
