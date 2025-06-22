class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int firstElement = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == firstElement) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                firstElement = nums[i];
                count = 1;
            }
        }
        return firstElement;
    }
}
