// 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合
// https://leetcode-cn.com/problems/generate-parentheses/
import java.util.*;

public class HomeworkDay5_1 {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(0, 0, n, "", result);
        return result;
    }

    private void generate(int left, int right, int max, String s, List<String> result) {
        if (left == max && right == max) {
            result.add(s);
            return;
        }

        if (left < max) generate(left+1, right, max, s+"(", result);
        if (right < left) generate(left, right+1, max, s+")", result);
    }
}
