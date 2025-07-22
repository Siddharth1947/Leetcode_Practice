class Solution {
    public int missingNumber(int[] nums) {
        // int sum = 0;
        // int n = nums.length;
        // int totalSum = n * (n + 1) / 2;
        // for (int i = 0; i < nums.length; i++) {
        //     sum += nums[i];
        // }
        // return totalSum - sum;
    //     Set<Integer> result = new HashSet<>();
    //     for(int num:nums){
    //         result.add(num);
    //     }
    //     for(int i=0;i<=result.size();i++){
    //         if(!result.contains(i)){
    //             return i;

    //         }
    //     }
    //     return -1;

    // 
    
    int result = nums.length;  
    for (int i = 0; i < nums.length; i++) {
        result ^= i ^ nums[i];
    }
    return result;
}


}