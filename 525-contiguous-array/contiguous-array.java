class Solution {
    public int findMaxLength(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[i]=-1;

            }
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int sum=0;
        int max=0;
        
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int need=sum;
            if(map.containsKey(need)){
                max=Math.max(max,i-map.get(need));
            }
            if(map.containsKey(need)==false){
                map.put(need,i);
            }


        }
        return max;
        
    }
}