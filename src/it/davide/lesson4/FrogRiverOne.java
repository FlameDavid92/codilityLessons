package it.davide.lesson4;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {
    public static int solution(int X, int[] A) {
        Set<Integer> mySet = new HashSet<>();
        int c=0;
        while(c<A.length){
            mySet.add(A[c]);
            if(mySet.size() == X) return c;
            c++;
        }
        return -1;
    }
}
