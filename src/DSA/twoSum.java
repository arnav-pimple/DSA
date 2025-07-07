package DSA;
//https://leetcode.com/problems/two-sum/submissions/
import java.util.HashMap;
import java.util.Map;

class twosum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] {numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}
