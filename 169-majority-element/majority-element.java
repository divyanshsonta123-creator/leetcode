class Solution {
    public int majorityElement(int[] nums) {
        int ans=Integer.MIN_VALUE;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
          if(map.containsKey(nums[i])){
            map.put(nums[i],map.get(nums[i])+1);
          }
          else{
            map.put(nums[i],1);
          }
        }
        int max=Integer.MIN_VALUE;
        for(int ele: map.keySet()){
            if(max<map.get(ele)){
                max=map.get(ele);
                ans=ele;
            }
        }
        return ans;

        
    }
}