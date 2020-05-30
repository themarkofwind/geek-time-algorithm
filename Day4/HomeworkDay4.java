import java.util.*;

public class HomeworkDay4 {

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}

    public List<Integer> preorder1(Node root) {
        List<Integer> result = new ArrayList<>();
        pre(result, root);
        return result;
    }

    private void pre(List<Integer> result, Node node) {
        if (null != node) {
            result.add(node.val);
            for (Node n : node.children) {
                pre(result, n);
            }
        }
    }

    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            Node n = stack.pop();
            if (null != n) {
                result.add(n.val);
                List<Node> childrens = n.children;
                if (null != childrens && childrens.size() > 0) {
                    for (int i = childrens.size() - 1; i >= 0; i--) {
                        stack.push(childrens.get(i));
                    }
                }
            }
        }
        return result;
    }

}
