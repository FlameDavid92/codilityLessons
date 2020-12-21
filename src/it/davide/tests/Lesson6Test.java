package it.davide.tests;

import it.davide.lesson6.Distinct;
import it.davide.lesson6.MaxProductOfThree;
import it.davide.lesson6.Triangle;

public class Lesson6Test {
    public static void testDistinct(){
        System.out.println(Distinct.solution(new int[] {1,9,5,4,4,6,7,9,8,3,2,9}) == 9);
    }

    public static void testMaxProductOfThree(){
        System.out.println(MaxProductOfThree.solution(new int[] {-2,9,-1,3,-4}) == 72);
    }

    public static void testTriangle(){
        System.out.println(Triangle.solution(new int[] {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE}) == 1);
    }
}
