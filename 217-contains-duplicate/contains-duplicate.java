class Solution {
    public boolean containsDuplicate(int[] nums) {
        // int n = nums.length;
        // Arrays.sort(nums);
        // for(int i=0;i<n-1;i++){
            
        //     if(nums[i]==nums[i+1]){
        //         return true;
        //     }
        // }
        // return false;
        int n = nums.length;
        HashMap<Integer,Integer> has = new HashMap<>();
        for(int i=0;i<n;i++){
            if(has.containsKey(nums[i])){
                return true;
            }
            has.put(nums[i],1);
        }
        return false;

        
    }
}