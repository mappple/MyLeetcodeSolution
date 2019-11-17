public class Solution2 {
    public static int trap(int[] height) {
        int sum = 0;
        //不考虑最两端，下标范围 1 - length - 2
        for (int i = 1; i < height.length - 1; i++) {
            int maxL = 0;
            //找出左边最高的
            for (int j = i - 1; j >= 0 ; j--) {
                if (height[j] > maxL) {
                    maxL = height[j];
                }
            }

            int maxR = 0;
            //找出右边最高的
            for (int j = i + 1; j < height.length; j++) {
                if (height[j] > maxR) {
                    maxR = height[j];
                }
            }
            //找出两端中较小的
            int min = Math.min(maxL, maxR);
            //只有当较小的一段大于当前列的高度才会有水
            if (min > height[i]) {
                sum += min - height[i];
            }
        }
        return sum;
    }
}
