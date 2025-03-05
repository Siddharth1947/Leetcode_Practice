class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] result={-1,-1};
        result[0]=first(nums,target);
        result[1]=last(nums,target); 
        return result;
    }
    private int first(int[] nums,int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
    private int last(int[] nums,int target){
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
    
}