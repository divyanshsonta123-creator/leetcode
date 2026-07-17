class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans=new ArrayList<>();

          
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
            if(map.get(ele)>nums.length/3){
                ans.add(ele);
                
            }
        }
        return ans;
    }
}