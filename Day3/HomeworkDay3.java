//leetcode 11
//https://leetcode-cn.com/problems/container-with-most-water/
import java.util.*;

public class HomeworkDay3 {
    public int maxArea(int[] height) {
        if (null == height || height.length <= 1) {
            return 0;
        }
        int i = 0;
        int j = height.length - 1;
        int maxArea = calArea(height, i, j);
        while (i < j) {
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
            maxArea = Math.max(maxArea, calArea(height, i, j));
        }
        return maxArea;
    }

    private int calArea(int[] height, int i, int j) {
        return (j-i) * Math.min(height[i], height[j]);
    }
}
