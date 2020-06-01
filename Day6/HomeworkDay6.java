// 验证二叉搜索树
// https://leetcode-cn.com/problems/validate-binary-search-tree/
public class HomeworkDay6 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    
    long pre = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if (null == root) return true;
        // 校验左子树
        if (!isValidBST(root.left)) return false;
        // 对比当前节点和前一个节点
        if (root.val <= pre) return false;
        pre = root.val;
        // 对比右子树
        if (!isValidBST(root.right)) return false;
        return true;
    }

}
