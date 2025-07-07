package DSA;
//https://leetcode.com/problems/subarray-sum-equals-k/submissions/
import java.util.HashMap;
public class SubarraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0, count = 0;
        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int k = 3;
        int result = subarraySum(nums, k);
        System.out.println("Count of subarrays: " + result); // Output: 2
    }
}
