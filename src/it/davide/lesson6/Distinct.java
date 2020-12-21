package it.davide.lesson6;

import java.util.Arrays;

public class Distinct {
    public static int solution(int[] A) {
        return (int) Arrays.stream(A).distinct().count();
    }
}
