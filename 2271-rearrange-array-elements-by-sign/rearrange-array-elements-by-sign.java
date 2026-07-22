class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos[]=new int[nums.length/2];
        int nega[]=new int [nums.length/2];
        int j=0;
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pos[j]=nums[i];
                j++;
            }
             if(nums[i]<0){
                nega[k]=nums[i];
                k++;
            }

        }
        for(int i=0;i<nums.length/2;i++){
            nums[i*2]=pos[i];
            nums[i*2+1]=nega[i];
        }
        return nums;
        
    }
}