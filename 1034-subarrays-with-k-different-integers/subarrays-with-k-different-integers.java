class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return sub(nums,k)-sub(nums,k-1);
    }
    public int sub(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int l = 0 , r = 0 , count = 0;
        while(r<n){
            if(map.containsKey(nums[r])){
                int c1 = map.get(nums[r]);
                map.put(nums[r],c1+1);
            }
            else{
                map.put(nums[r],1);
            }

            while((map.size())>k){
                int ele = map.get(nums[l]);
                if(ele==1){
                    map.remove(nums[l]);
                }
                else{
                    map.put(nums[l],ele-1);
                }
                l++;
            }
            if(map.size()<=k){
                count+=(r-l+1);
                r++;
            }
        }
        return count;
    }
}