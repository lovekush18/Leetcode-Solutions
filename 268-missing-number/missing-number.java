class Solution {
    public int missingNumber(int[] nums) {
        //int n = nums.length;
        //int sum = (n*(n+1))/2;
        //int sum2 = 0;
        //for(int i=0; i<n; i++){
        //    sum2 += nums[i];
        //}
        //int missing = sum-sum2;
        //return missing;


        // Arrays.sort(nums);
        // int n= nums.length;
        // for(int i=0; i<n; i++){
        //     if(nums[i]!=i){
        //         return i;
        //     }
            
        // }
        // return n;

        HashSet<Integer> set = new HashSet<>();
        int missing = 0;
        for(int i=0;i<nums.length;i++){
            if(set.add(nums[i])){
             }
        }
        for(int i=0;i<nums.length;i++){
            if(!set.contains(i+1)){
                missing = i+1;
            }
        }
        return missing;
        
    }
}