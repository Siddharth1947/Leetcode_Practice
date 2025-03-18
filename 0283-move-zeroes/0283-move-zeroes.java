class Solution {
    public void moveZeroes(int[] nums) {
       int i = 0;
       for(int j = i;j<nums.length;j++){
        if(nums[j] != 0){
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
        }

       }
       
       
        
    }
}