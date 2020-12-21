package it.davide.lesson5;

public class CountDiv {
    public static int solution(int A, int B, int K) {
        int dist = B-A+1;
        if(K == 1) return dist;
        else if(K == 2){
            if(dist % 2 == 0) return dist/2;
            else{
                if(A % 2 == 0) return dist/2+1;
                else return dist/2;
            }
        }
        else if(K > B) return (A != 0) ? 0 : 1;
        else if(K == B) return (A != 0) ? 1 : 2;
        else if(K >= A){
            int count = (A == 0) ? 1 : 0;
            for(int i=K; i<=B; i+=K){
                count++;
            }
            return count;
        }else{
            int count = 0;
            int j = A;
            while(j<=B){
                if(j%K == 0){
                    count++;
                    j+=K;
                }else j++;
            }
            return count;
        }
    }
}
