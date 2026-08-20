class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map=new HashMap<>();
        HashMap<Character,Character> map2=new HashMap<>();

        if(s.length()!=t.length()){
            return false;
        }

        for(int i=0;i<s.length();i++){
            char sch=s.charAt(i);
            char tch=t.charAt(i);

            if(map.containsKey(sch)==true){
                if(map.get(sch)!=tch){
                    return false;
                }
            }
            map.put(sch,tch);
        }

         for(int i=0;i<t.length();i++){
            char sch=s.charAt(i);
            char tch=t.charAt(i);

            if(map2.containsKey(tch)==true){
                if(map2.get(tch)!=sch){
                    return false;
                }
            }
            map2.put(tch,sch);

        }
        return true;
        
    }
}