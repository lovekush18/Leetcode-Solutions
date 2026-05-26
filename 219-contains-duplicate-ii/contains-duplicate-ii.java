class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        HashSet<Integer> h1 = new HashSet<>();
        for(int i=0;i<n;i++){
             if(h1.contains(nums[i])){
                return true;
            }
            h1.add(nums[i]);
        
        if(h1.size()>k){
            h1.remove(nums[i-k]);
        }
        }
           
        return false;
    }
}