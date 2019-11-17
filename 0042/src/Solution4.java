public class Solution4 {
    public static int trap(int[] height) {
        int sum = 0;
        int maxL = 0;
        int maxR = 0;
        int left = 1;
        int right = height.length - 2; // 加右指针
        for (int i = 1; i < height.length - 1; i++) {
            //从左往右更
            if (height[left - 1] < height[right + 1]) {
                maxL = Math.max(maxL, height[left - 1]);
                int min = maxL;
                if (min > height[left]) {
                    sum += min - height[left];
                }
                left++;
            //从右往左更
            } else {
                maxR = Math.max(maxR, height[right + 1]);
                int min = maxR;
                if (min > height[right]) {
                    sum += min - height[right];
                }
                right--;
            }
        }
        return sum;
    }
}
