package it.davide.lesson4;

public class MaxCounters {
    public static int[] solution(int N, int[] A){
        int[] ret = new int[N];
        int addToAll = 0;
        int max = 0;
        for(int k=0; k<A.length; k++){
            if(A[k] == N+1) {
                for(int x=0; x<N; x++){
                    ret[x] = max;
                }
                addToAll++;
            }else {
                ret[A[k]-1]++;
                if(ret[A[k]-1] > max) max = ret[A[k]-1];
            }
        }
        return ret;
    }

    public static int[] solution2(int N, int[] A) {
        int[] ret = new int[N];
        int[] lastOpMaxUpdates = new int[N];
        int currentMax = 0, lastOpMax = 0;
        boolean opToAll = false;

        for (int j : A) {
            if (j == N + 1) {
                if (!opToAll) opToAll = true;
                lastOpMax = currentMax;
            } else {
                if (lastOpMaxUpdates[j - 1] != lastOpMax) {
                    ret[j - 1] = lastOpMax + 1;
                    lastOpMaxUpdates[j - 1] = lastOpMax;
                } else {
                    ret[j - 1]++;
                }

                if (ret[j - 1] > currentMax) currentMax = ret[j - 1];
            }
        }

        if(opToAll){
            for(int i=0; i<N; i++){
                if(ret[i] < lastOpMax) ret[i] = lastOpMax;
            }
        }
        return ret;
    }
}
