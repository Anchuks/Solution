import java.io.*;
import java.util.*;


public class Solution {
    static int res = 0;

    static int Recursive(int num, int x, int k, int n) {
        if (x == 0)
            res++;

        int r = (int) Math.floor(Math.pow(num, 1.0 / n));

        for (int i = k + 1; i <= r; i++) {
            int a = x - (int) Math.pow(i, n);
            if (a >= 0)
                Recursive(num,
                        x - (int) Math.pow(i, n), i, n);
        }
        return res;
    }

    static int powerSum(int X, int N) {
        return Recursive(X, X, 0, N);

    }

    public static void main(String[] args) {
        System.out.println(powerSum(100, 2));
    }
}