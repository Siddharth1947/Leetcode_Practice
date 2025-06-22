class Solution {
    public int maxSubArray(int[] nums) {
        int Current_max = nums[0];
        int max_so_far = nums[0];

        for(int i=1;i<nums.length;i++){
            Current_max= Math.max(nums[i],Current_max+nums[i]);
            max_so_far = Math.max(Current_max,max_so_far);
        }
        return max_so_far;
        
        
        
    }
}