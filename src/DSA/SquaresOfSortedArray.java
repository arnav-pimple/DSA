package DSA;
//https://leetcode.com/problems/squares-of-a-sorted-array/submissions/
import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] input = {-7, -3, 2, 3, 11};
        int[] output = sortedSquares(input);
        System.out.println("Sorted squares: " + Arrays.toString(output));
    }

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        int index = n - 1;

        while (left <= right) {
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];

            if (leftSq > rightSq) {
                result[index] = leftSq;
                left++;
            } else {
                result[index] = rightSq;
                right--;
            }
            index--;
        }
        return result;
    }

}
