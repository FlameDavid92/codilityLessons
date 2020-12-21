package it.davide.lesson5;

public class GenomicRangeQuery {
    public static int[] solution(String S, int[] P, int[] Q) {
        int[][] prefixArray = new int[S.length()][4];
        /*Array di contatori del num di lettere per ogni prefisso di S
        pos 0:A 1:C 2:G 3:T*/
        prefixArray[0][getIndex(S.charAt(0))]++;
        for(int i=1; i<S.length(); i++){
            prefixArray[i] = prefixArray[i-1].clone();
            prefixArray[i][getIndex(S.charAt(i))]++;
        }
        int[] ret = new int[P.length];
        for(int j=0; j<P.length; j++){
            ret[j] = calcImpact(prefixArray, P[j], Q[j]);
        }
        return ret;
    }

    private static int calcImpact(int[][] prefixArray, int start, int end){
        int nuclNum = prefixArray[0].length;
        int[] all = prefixArray[end];
        int[] toRemove;
        if(start == 0) toRemove = new int[nuclNum];
        else toRemove = prefixArray[start-1];

        for(int i=0; i<nuclNum; i++){
            if(all[i] - toRemove[i] > 0) return i+1;
        }
        return -1;
    }

    private static int getIndex(char c){
        switch(c){
            case 'A':
                return 0;
            case 'C':
                return 1;
            case 'G':
                return 2;
            case 'T':
                return 3;
            default:
                return -1;
        }
    }
}
