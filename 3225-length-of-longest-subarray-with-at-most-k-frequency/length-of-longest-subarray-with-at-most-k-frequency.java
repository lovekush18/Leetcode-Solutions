class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int l = 0 , r = 0;
        int n = nums.length;
        
        int maxcount = 0;
        while(r<n){
            if(map.containsKey(nums[r])){
                int c1 = map.get(nums[r]);
                map.put(nums[r],c1+1);
            }
            else{
                map.put(nums[r],1);
            }
            while(map.get(nums[r])>k){
                
                int c2 = map.get(nums[l]);
                if(c2==1){
                    map.remove(nums[l]);
                }
                else{
                    map.put(nums[l],c2-1);
                }
                l++;

            }
            if(map.get(nums[r])<=k){
                maxcount = Math.max(maxcount,r-l+1);
                r++;
            }
        }
        return maxcount;

        
    }
}