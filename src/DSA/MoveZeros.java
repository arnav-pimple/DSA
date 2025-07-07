package DSA;
//https://leetcode.com/problems/move-zeroes/submissions/
class zeros {
    public void moveZeroes(int[] nums) {
        int nonZeroPointer = 0;

        for (int current = 0; current < nums.length; current++) {
            if (nums[current] != 0) {
                nums[nonZeroPointer] = nums[current];
                nonZeroPointer++;
            }
        }
        for (int i = nonZeroPointer; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
