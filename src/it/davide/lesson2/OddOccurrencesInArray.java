package it.davide.lesson2;

import java.util.HashSet;
import java.util.Set;

public class OddOccurrencesInArray {
    public static int solution(int[] A) {
        Set<Integer> mySet = new HashSet<>();
        for(int intero : A){
            if(mySet.contains(intero)) mySet.remove(intero);
            else mySet.add(intero);
        }
        return mySet.toArray(new Integer[1])[0];
    }
}
