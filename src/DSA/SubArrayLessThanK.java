
//https://leetcode.com/problems/subarray-product-less-than-k/submissions/
package DSA;
import java.util.Arrays;

class SubArrayProductLessThanK {

    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;
        int left = 0, count = 0;
        long prod = 1;
        for (int right = 0; right < nums.length; right++) {
            prod *= nums[right];
            while (prod >= k) {
                prod /= nums[left++];
            }
            count += right - left + 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 6};
        int k = 100;
        System.out.println("Count: " + numSubarrayProductLessThanK(nums, k)); // Output: 8
    }
}

