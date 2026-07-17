class Solution {
    public int maxProfit(int[] prices) {
        return pro(prices);
        // return profit(prices);
    }
    static int profit(int arr[]){
        int maxProfit=0;
        int buyBest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>buyBest){
                maxProfit=Math.max(maxProfit,arr[i]-buyBest);
            }
            buyBest=Math.min(buyBest,arr[i]);
        }
        if(maxProfit<=0){
            return 0;
        }
        else{
            return maxProfit;
        }
    }
    static int pro(int arr[]){
         int profit=0;
        int buy=arr[0];
        for(int i=0;i<arr.length;i++){
            buy=Math.min(arr[i],buy);
            profit=Math.max(profit,arr[i]-buy);
        }
        return profit;

    }
    
}