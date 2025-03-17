class Solution {
    public boolean divideArray(int[] nums) {
    //     boolean result = false;
    //     for(int i=0;i<nums.length;i++){
    //         for(int j=1;j<nums.length-1;j++){
    //         if(nums.length % 2 == 0 && nums[i] == nums[j]){
    //             result = true;
    //         }else{
    //             return result;
    //         }

    //     }}
    //     return false;
        
    // }
    Arrays.sort(nums);
    boolean result =true;
    for(int i=0;i<nums.length;i+=2){
        if(nums[i]!=nums[i+1]){
            result = false;
        }
    }
    return result;
}}