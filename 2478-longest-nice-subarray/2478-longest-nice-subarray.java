class Solution {
    public int longestNiceSubarray(int[] nums) {
        int maxLength = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int bitMask = 0; 
            for (int j = i; j < n; j++) {
                if ((bitMask & nums[j]) != 0) break; 

                bitMask |= nums[j]; 
                maxLength = Math.max(maxLength, j - i + 1);
            }
        }

        return maxLength;
    }
}

