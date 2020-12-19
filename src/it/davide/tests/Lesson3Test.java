package it.davide.tests;

import it.davide.lesson3.FrogJmp;
import it.davide.lesson3.PermMissingElem;
import it.davide.lesson3.TapeEquilibrium;

public class Lesson3Test {
    public static void testFrogJmp(){
        System.out.println(FrogJmp.solution(10,30,5) == 4);
    }

    public static void testPermMissingElem(){
        System.out.println(PermMissingElem.solution(new int[] {1,2,5,4}) == 3);
    }

    public static void testTapeEquilibrium(){
        System.out.println(TapeEquilibrium.solution2(new int[] {1,2,3,4}) == 2);
    }
}
