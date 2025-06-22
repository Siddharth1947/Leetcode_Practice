class Solution {
    public int maxProfit(int[] arr) {
        if(arr.length == 0 || arr.length == 1) return 0; 
        int max_profit = 0;
        int min_price = arr[0];
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]<min_price){
                min_price = arr[i];
            }else{
                int profit = arr[i]-min_price;
                if(profit>max_profit){
                    max_profit = profit;
                }
            }
            

        }
        return max_profit;
    }
}