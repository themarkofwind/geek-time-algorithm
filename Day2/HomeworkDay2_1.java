//leetcode 283 move zeros
//https://leetcode-cn.com/problems/move-zeroes/
public class HomeworkDay2_1 {
    public void moveZeroes(int[] nums) {
        if (null == nums || nums.length <= 0) {
            return;
        }

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[j] == 0 && nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            } else if (nums[j] != 0) {
                j++;
            }
        }
    }
}
