package it.davide.tests;

import it.davide.lesson4.FrogRiverOne;
import it.davide.lesson4.MaxCounters;
import it.davide.lesson4.MissingInteger;
import it.davide.lesson4.PermCheck;

import java.util.Arrays;

public class Lesson4Test {
    public static void testFrogRiverOne(){
        System.out.println(FrogRiverOne.solution(4,new int[] {4,2,3,2,3,1,2,4}) == 5);
    }

    public static void testMaxCounters(){
        System.out.println(Arrays.equals(MaxCounters.solution2(3,new int[] {1,2,3,2,4,2,2}), new int[] {2,4,2}));
    }

    public static void testMissingInteger(){
        System.out.println(MissingInteger.solution3(new int[] {-2,3,1,-6,5,10,4,22,-6}) == 2);
    }

    public static void testPermCheck(){
        System.out.println(PermCheck.solution(new int[] {4, 1, 3, 2, 5}) == 1);
    }
}
