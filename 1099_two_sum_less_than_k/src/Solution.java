import java.util.Arrays;

public class Solution {
    public static int twoSumLessThanK(int[] A, int K) {
        if (A == null || A.length == 0) return -1;

        Arrays.sort(A);

        int l = 0, r = A.length - 1;
        int res = Integer.MIN_VALUE;

        while (l < r) {
            if (A[l] + A[r] > K) {
                r--;
            } else {
                res = Math.max(res, A[l] + A[r]);
                l++;
            }
        }
        return res == Integer.MIN_VALUE ? -1 : res;
    }
}
