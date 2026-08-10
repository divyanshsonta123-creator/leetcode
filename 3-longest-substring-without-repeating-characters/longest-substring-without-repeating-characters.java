class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int i=0;
        int j=0;
        int ans=0;
        while(j<s.length()){
            char ch=s.charAt(j);
            if(map.containsKey(ch)==false){
                map.put(ch,j);
                j++;
            }
            else{
                int window=j-i;
                ans=Math.max(window,ans);
                if(map.get(ch)>=i){
                     i=map.get(ch)+1;

                }
            
                map.put(ch,j);

                j++;
            }
            
             int window=j-i;
                ans=Math.max(window,ans);

        }
        return ans;

        
    }
}