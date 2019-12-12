public class Solution {
    /**
     * input: [-10,-3,0,5,9]
     * output: [0,-3,9,-10,null,5]
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        return nums == null ? null : buildTree(nums, 0, nums.length - 1);
    }

    private TreeNode buildTree(int[] nums, int l, int r) {
        if (l > r) {
            return null;
        }
        int m = l + (r - l) / 2;
        TreeNode root = new TreeNode(nums[m]);
        root.left = buildTree(nums, l, m - 1);
        root.right =  buildTree(nums, m + 1, r);
        return root;
    }
}
