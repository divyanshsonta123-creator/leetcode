class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
         Set<List<Integer>> list=new HashSet<>();

        Arrays.sort(arr);
        for(int i=0;i<arr.length-3;i++){
            for(int j=i+1;j<arr.length-2;j++){
                  int left=j+1;
            int right= arr.length-1;
            while(left<right){
               long sum = (long) arr[i] + arr[j] + arr[left] + arr[right];
                if(sum==target){
                    list.add(Arrays.asList(arr[i],arr[left],arr[right],arr[j]));
                    left++;
                    right--;
                }
                else if(sum>target){
                    right--;

                }
                else{
                    left++;
                }
            }
        }

            }
          
        return new ArrayList<>(list);
        
    }
}