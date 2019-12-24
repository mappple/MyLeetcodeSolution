public class Solution {

    public int firstMissingPositive(int[] nums) {
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            // 前两个判断是否成为索引
            // 后一个判断 例如3在不在索引2上
            while (nums[i] > 0 && nums[i] <= len && nums[nums[i] -1] != nums[i]) {
                swap(nums, nums[i] -1, i);
            }
        }

        for (int i = 0; i < len; i++) {
            if (nums[i] -1 != i) {
                return i + 1;
            }
        }

        return len + 1;
    }

    private void swap(int[] nums, int index1, int index2) {
        if (index1 == index2) {
            return;
        }
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
