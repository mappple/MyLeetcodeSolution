import javafx.util.Pair;
import java.lang.Math;
import java.util.LinkedList;
import java.util.Queue;


public class Solution {
    /**
     * 深度优先DFS
     * 时间复杂度 O(N)
     * 空间复杂度 bad situation O(N) ~ good situation O(log(N))
     */
    public static int maxDepth(TreeNode root) {
        return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;

    }
    /**
     * 广度优先BFS
     * 时间复杂度 O(N)
     * 空间复杂度 O(N)
     */
    public static int maxDepth2(TreeNode root) {
        Queue<Pair<TreeNode, Integer>> stack = new LinkedList<>();
        if (root != null) {
            stack.add(new Pair(root, 1));
        }

        int depth = 0;
        while (! stack.isEmpty()) {
            Pair<TreeNode, Integer> current = stack.poll();
            root = current.getKey();
            int currentDepth = current.getValue();
            if (root != null) {
                depth = Math.max(depth, currentDepth);
                stack.add(new Pair(root.left, currentDepth + 1));
                stack.add(new Pair(root.right, currentDepth + 1));
            }
        }
        return depth;
    }

}
