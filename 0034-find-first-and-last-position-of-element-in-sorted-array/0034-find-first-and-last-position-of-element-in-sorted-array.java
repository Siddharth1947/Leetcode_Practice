class Solution {
    public int[] searchRange(int[] arr, int target) {
        int[] result = {-1, -1};  
        result[0] = findFirst(arr, target);
        result[1] = findLast(arr, target);
        return result;
    }
    
    private int findFirst(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        int first = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                first = mid;
                end = mid - 1; 
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return first;
    }

    private int findLast(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        int last = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                last = mid;
                start = mid + 1; 
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return last;
    }
}
