class Solution {
    public int sumOfUnique(int[] nums) {
        int n = nums.length;
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
             }
             else{
                int count = map.get(nums[i]);
                map.put(nums[i],count+1);
             }  
         }
         ArrayList<Integer> list = new ArrayList<>(map.keySet());
         int m = list.size();
         for(int i=0;i<m;i++){
            int ele = list.get(i);
            int fre = map.get(ele);
            if(fre==1){
                sum+=ele;
            }
         }
         return sum;
         
        
        
    }
}