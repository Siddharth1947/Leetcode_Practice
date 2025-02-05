class Solution {
    public int removeDuplicates(int[] arr) {
        int count=0;
        int index=1;
        if(arr.length==0){
            return 0;
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i] != arr[i-1]){
            arr[index] = arr[i];
            index++;
            }
        }
        return index;
    }
}