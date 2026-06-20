class Solution {
    public void moveZeroes(int[] nums) {
    
        int i=0;
        
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0){
                swap(nums,i,j);
                i++;

            }
        }
    }
    static void swap(int arr[],int index,int last){
        int temp=arr[index];
        arr[index]=arr[last];
        arr[last]=temp;
    }
}