class Solution {
    public int[] searchRange(int[] nums, int target) {
    //     int [] result={-1,-1};
    //     result[0]=first(nums,target);
    //     result[1]=last(nums,target); 
    //     return result;
    // }
    // private int first(int[] nums,int target){
    //     for(int i=0;i<nums.length;i++){
    //         if(nums[i] == target){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    // private int last(int[] nums,int target){
    //     for(int i=nums.length-1;i>=0;i--){
    //         if(nums[i] == target){
    //             return i;
    //         }
    //     }
    //     return -1;
    int [] result={-1,-1};
    result[0]=first(nums,target);
    result[1]=last(nums,target);
    return result;


    }
    private int first(int []nums,int target){
        int start=0;
        int end=nums.length-1;
        int first=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                first=mid;
                end=mid-1;
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return first;
        
    
}
private int last(int[] nums,int target){
    int start=0;
    int end=nums.length-1;
    int last=-1;
    while(start<=end){
        int mid=start+(end-start)/2;
        if(nums[mid]==target){
            last=mid;
            start=mid+1;
        }else if(nums[mid]>target){
            end=mid-1;

        }else{
            start=mid+1;
        }
    }
    return last;
}}