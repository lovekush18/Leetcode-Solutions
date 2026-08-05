class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        long sum = 0;
        for(int i =0;i<k;i++){
            sum+=nums[i];
            if(!(map.containsKey(nums[i]))){
                map.put(nums[i],1);
            
            }
            else{
                int count = map.get(nums[i]);
                map.put(nums[i],count+1);
            }
        }
        long maxsum = 0;
        if(map.size()==k) maxsum = sum;
        
        for(int i =k;i<n;i++){
            if(!(map.containsKey(nums[i]))){
                map.put(nums[i],1);
            
            }
            else{
                int count = map.get(nums[i]);
                map.put(nums[i],count+1);
            }
            sum=sum+nums[i]-nums[i-k];
            
            int key = map.get(nums[i-k]);
            if(key==1){
                map.remove(nums[i-k]);
                
            }
            else{
                map.put(nums[i-k],key-1);
            }
            if(map.size()==k) 
            maxsum = Math.max(maxsum,sum);     
                      
        }
        return maxsum;
    }
}