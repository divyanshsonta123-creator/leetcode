class Solution {
    public int findPeakElement(int[] nums) {
        
     int start=0;
     int end=nums.length-1;

     while(start<end)   {
       int mid= (start+end)/2;

       if(nums[mid]>nums[mid+1]){
        end=mid;


       }

       else{
//(arr[mid]<arr[mid+1]) this is thr case for the else as we are not here to check for the equal to part

        start=mid+1;
       }

     }
     return start;
        
    }
}