package it.davide;

import static it.davide.tests.Lesson1Test.*;
import static it.davide.tests.Lesson2Test.*;
import static it.davide.tests.Lesson3Test.*;
import static it.davide.tests.Lesson4Test.*;

public class Main {
    public static void main(String[] args) {
        //testLesson1();
        //testLesson2();
        //testLesson3();
        //testLesson4();
    }

    private static void testLesson1(){
        testBinaryGap();
    }

    private static void testLesson2(){
        testCyclicRotation();
        testOddOccurrencesInArray();
    }

    private static void testLesson3(){
        testFrogJmp();
        testPermMissingElem();
        testTapeEquilibrium();
    }

    private static void testLesson4(){
        testFrogRiverOne();
        testMaxCounters();
        testMissingInteger();
        testPermCheck();
    }

    private static void testLesson5(){

    }
}
