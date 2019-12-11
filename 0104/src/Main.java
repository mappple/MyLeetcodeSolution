public class Main {
    public static void main(String[] args) {
        TreeNode x0 = new TreeNode(3);
        TreeNode x1 = new TreeNode(9);
        TreeNode x2 = new TreeNode(20);
        TreeNode x5 = new TreeNode(15);
        TreeNode x6 = new TreeNode(7);

        x0.left = x1;
        x0.right = x2;
        x2.left = x5;
        x2.right = x6;

        System.out.println(Solution.maxDepth2(x0));
    }
}
