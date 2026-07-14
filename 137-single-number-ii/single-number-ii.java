class Solution {
    public int singleNumber(int[] nums) {
        // Arrays.sort(nums);
        // int n = nums.length;
        // for(int i=0;i<n-1;i+=3){
        //     if(nums[i]!=nums[i+1]){
        //         return nums[i];
        //     }
        // }
        // return nums[n-1];
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                int count = map.get(nums[i]);
                    map.put(nums[i],count+1);
                
            }
            else{
                map.put(nums[i],1);
            }
        }
        for(int i=0;i<n;i++){
        if(map.get(nums[i])==1) return nums[i];
    }
    return -1;
    }
}