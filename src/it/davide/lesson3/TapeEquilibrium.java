package it.davide.lesson3;

public class TapeEquilibrium {
    public static int solution(int[] A){
        int currLeft = 0;
        int currRight = 0;
        for (int j : A) {
            currRight += j;
        }

        int min = Integer.MAX_VALUE;
        for(int i=0; i<A.length-1;i++){
            currLeft += A[i];
            currRight -= A[i];
            int currP = Math.abs(currLeft-currRight);
            if(currP<min) min = currP;
        }
        return min;
    }

    public static int solution2(int[] A){
        int[] leftSums = new int[A.length-1];
        for(int i=0; i<A.length-1; i++){
            if(i==0) leftSums[i] = A[i];
            else leftSums[i] = leftSums[i-1]+A[i];
        }

        int[] rightSums = new int[A.length];
        for(int j=A.length-1; j>=0; j--){
            if(j == A.length-1) rightSums[j] = A[j];
            else rightSums[j] = rightSums[j+1]+A[j];
        }

        int min = Integer.MAX_VALUE;
        for(int k=0; k<A.length-1; k++){
            int currP = Math.abs(leftSums[k]-rightSums[k+1]);
            if(currP<min) min = currP;
        }
        return min;
    }
}
