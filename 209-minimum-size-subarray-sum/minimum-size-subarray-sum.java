class Solution {
    public int minSubArrayLen(int target, int[] nums) {
    int ans=Integer.MAX_VALUE;
    int sum=0;
    int i=0;
    int j=0;
    while(j<nums.length){
        sum+=nums[j];
       
        while(sum>=target){

            int window=j-i+1;
            
            ans=Math.min(window,ans);
            sum=sum-nums[i];
            i++;
        }
        j++;
    }
    if(ans==Integer.MAX_VALUE){
        return 0;
    }
    return ans;
    
    
}
}