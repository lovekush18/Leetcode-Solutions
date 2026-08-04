class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;
         List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int missing = 0;
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        int min = nums[0];
        int max = nums[0];
        for(int i=0;i<n;i++){
            if(nums[i]<min) min = nums[i];
            if(nums[i]>max) max = nums[i];
        }
        for(int i=min;i<max;i++){
            if(!set.contains(i+1)){
                missing = i+1;
                list.add(missing);
            }
        }
        return list;
        
    }
}