package it.davide.tests;

import it.davide.lesson5.CountDiv;
import it.davide.lesson5.GenomicRangeQuery;

import java.util.Arrays;

public class Lesson5Test {
    public static void testCountDiv(){
        System.out.println(CountDiv.solution(0,10,3) == 4);
    }
    public static void testGenomicRangeQuery(){
        System.out.println(Arrays.equals(GenomicRangeQuery.solution("TTGCA",new int[] {0,1,0}, new int[] {0,3,4}),new int[] {4,2,1}));
    }
}
