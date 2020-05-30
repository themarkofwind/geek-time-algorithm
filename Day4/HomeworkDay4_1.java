import java.util.*;

public class HomeworkDay4_1 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {val = x;}
    }

    public List<Integer> preorderTraversal1(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        pre(result, root);
        return result;
    }

    private void pre(List<Integer> result, TreeNode node) {
        if (null != node) {
            result.add(node.val);
            pre(result, node.left);
            pre(result, node.right);
        }
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode n = stack.pop();
            if (null != n) {
                result.add(n.val);
                stack.push(n.right);
                stack.push(n.left);
            }
        }
        return result;
    }
}
