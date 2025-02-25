class Solution {
    public int[] runningSum(int[] arr) {
        int size = arr.length;

        for(int i=1;i<size;i++){
            arr[i]=arr[i]+arr[i-1];
            
            
            
        }
        return arr;
        
        
        
    }
}