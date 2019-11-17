public class Solution3 {
    public static int trap(int[] height) {
        int sum = 0;
        int[] maxL = new int[height.length];
        int[] maxR = new int[height.length];

        for (int i = 1; i < height.length; i++) {
            maxL[i] = Math.max(maxL[i - 1], height[i - 1]);
        }
        for (int i = height.length - 2; i >= 0 ; i--) {
            maxR[i] = Math.max(maxR[i + 1], height[i + 1]);
        }
        for (int i = 0; i < height.length - 1; i++) {
            int min = Math.min(maxL[i], maxR[i]);
            if (min > height[i]) {
                sum += min - height[i];
            }
        }
        return sum;
    }
}
