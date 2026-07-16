class Solution {
    public int[] twoSum(int[] nums, int target) {
     
        int ans[]={-1,-1};

        // Step 1: Build ArrayList of pairs [value, originalIndex]
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++ ){
            
             
            int need=target-nums[i];
          
            
            if(map.containsKey(need)){
              ans[0]=i;
              ans[1]=map.get(need);
            }
            
              
             if(map.containsKey(need)==false){
                 map.put(nums[i],i);
            }
           
               
            
        }
        
        return ans;
    }
}
