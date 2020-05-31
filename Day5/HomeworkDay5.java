// max depth of binary tree
// https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/submissions/

import java.util.*;

public class HomeworkDay5 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int maxDepth(TreeNode root) {
        if (null == root) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
