package it.davide.tests;

import it.davide.lesson2.CyclicRotation;
import it.davide.lesson2.OddOccurrencesInArray;

import java.util.Arrays;

public class Lesson2Test {
    public static void testCyclicRotation(){
        int[] check = {7,9,1,3,5};
        System.out.println(Arrays.equals(CyclicRotation.solution(new int[] {1,3,5,7,9},2), check));
    }

    public static void testOddOccurrencesInArray(){
        System.out.println(OddOccurrencesInArray.solution(new int[] {1,1,3,5,4,4,5,9,8,9,8}) == 3);
    }
}
