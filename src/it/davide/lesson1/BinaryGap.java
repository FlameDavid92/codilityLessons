package it.davide.lesson1;

public class BinaryGap {
    public static int solution(int N) {
        int temp = N;
        int calc = 0;
        int max = 0;
        boolean on = false;
        while(temp > 0){
            if(temp%2==1){
                if(!on) on = true;
                if(calc>max) max = calc;
                calc = 0;
            }else if(on && temp%2==0) calc++;
            temp /= 2;
        }
        return max;
    }
}