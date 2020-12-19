package it.davide.lesson4;

public class PermCheck {
    public static int solution(int[] A) {
        int N = A.length;
        boolean[] check = new boolean[N];
        for (int j : A) {
            if (j > N) return 0; //A[i] è sempre > 0
            else {
                if (check[j - 1]) return 0; //A[i] era già presente
                else check[j - 1] = true;
            }
        }
        return 1;
    }
}
