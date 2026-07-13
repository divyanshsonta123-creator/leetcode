class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        
        int sum=0;
        map.put(0,1);
        int subb=0;
       

        for(int i=0;i<nums.length;i++){
            
            sum+=nums[i];
            int need=sum-k;
            if(map.containsKey(need)){
                
               
                subb+=map.get(need);
                
            }

           map.put(sum, map.getOrDefault(sum, 0) + 1);


        }
        return subb;
        
    }
}