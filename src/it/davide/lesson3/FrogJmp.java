package it.davide.lesson3;

public class FrogJmp {
    public static int solution(int X, int Y, int D) {
        double W = Y-X;
        if(W == 0) return 0;
        else return (int)Math.ceil( W/D );
    }
}
