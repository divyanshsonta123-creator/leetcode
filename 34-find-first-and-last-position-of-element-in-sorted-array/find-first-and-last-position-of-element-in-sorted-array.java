class Solution {
    public int[] searchRange(int[] nums, int target) {

        int ans[]={-1,-1};
        int start=lower(nums,target);
        int end=upper(nums,target);
        ans[0]=start;
        ans[1]=end;
        return ans;
        
    }

     static int lower(int arr[],int target){
        int start=0;
        int ans=-1;
         int end=arr.length-1;
         while(start<=end){
             int mid=(start+end)/2;
             if(arr[mid]==target){
                 end=mid-1;
                 ans=mid;
             }
              else if(arr[mid]>target){
                       end=mid-1;
              }
             else{
                 start=mid+1;
             }
         }
         return ans;
    }
     static int upper(int arr[],int target){
        int start=0;
        int ans=-1;
         int end=arr.length-1;
         while(start<=end){
             int mid=(start+end)/2;
             if(arr[mid]==target){
                 start=mid+1;
                 ans=mid;
             }
             else if(arr[mid]<target){
                 start=mid+1;
                 
             }
             else{
                 end=mid-1;
             }
         }
         return ans;
    
}
}