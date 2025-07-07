package DSA;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/submissions/
class RemoveDuplicate {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int uniquePointer = 1;
        for (int current = 1; current < nums.length; current++) {
            if (nums[current] != nums[current - 1]) {
                nums[uniquePointer] = nums[current];
                uniquePointer++;
            }
        }
        return uniquePointer;
    }
}
