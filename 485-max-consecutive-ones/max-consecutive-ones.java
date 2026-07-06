class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // int count=0;
        // int max=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==1){
        //         count++;
        //         max=Math.max(count,max);
        //     }
        //     else{
        //         count=0;
        //     }
        // }
        // return max;
        return cos(nums,0,0);
        
    }
    public static int cos(int arr[],int i,int max){
        if(i==arr.length){
            return max;
        }
        int count=0;
        while(i<arr.length && arr[i]==1){
            count++;
            i++;

        }

        max=Math.max(count,max);
         if(i < arr.length && arr[i] == 0){
        i++;
    }
        return cos(arr,i,max);
    }
}