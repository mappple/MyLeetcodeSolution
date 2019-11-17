public class Solution1 {

    public static int trap(int[] height) {
        int sum = 0;
        int max = getMax(height);
        for (int i = 1; i < max; i++) {
            boolean isStart = false;
            int temp = 0;
            for (int j = 0; j < height.length; j++) {
                if (isStart && height[j] < i) {
                    temp++;
                }
                if (height[j] >= i) {
                    sum += temp;
                    temp = 0;
                    isStart = true;
                }
            }
        }
        return sum;
    }

    private static int getMax(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            if (height[i] > max) {
                max = height[i];
            }
        }
        return max;
    }
}
