class Solution {
    public int lengthOfLongestSubstring(String s) {
 HashMap<Character,Integer> map=new HashMap<>();
        int i=0;
        int j=0;
        int max=0;
        while(j<s.length()){
            char ch= s.charAt(j);
          if(map.containsKey(ch)==false){
              map.put(ch,j);
              j++;
          }
          
          else{
              int window=j-i;
              max=Math.max(window,max);
              
              if(map.get(ch)>=i){
                  i=map.get(ch)+1;
                
              }
                 map.put(ch,j);
                 j++;
             
          }
           int window=j-i;
              max=Math.max(window,max);
          
            
        }
        return max;




        // return longest(s);
           
    }
    // static int longest(String s) {

    //     int arr[] = new int[128];  // frequency map (ASCII)

    //     int left = 0;
    //     int maxLen = 0;

    //     for (int right = 0; right < s.length(); right++) {

    //         char ch = s.charAt(right);

    //         // Include character in window
    //         arr[ch]++;

    //         // If duplicate → shrink from left
    //         while (arr[ch] > 1) {
    //             arr[s.charAt(left)]--;
    //             left++;
    //         }

    //         maxLen = Math.max(maxLen, right - left + 1);
    //     }

    //     return maxLen;
    // }
}