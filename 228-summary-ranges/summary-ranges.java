class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        int n = nums.length;
        int i = 0 , j = 0;
        while(i<n){
            while(j<n-1 && nums[j]+1 == nums[j+1]){
                j++;
            }
            if(i==j){
                String s1 = String.valueOf(nums[i]);
                list.add(s1);
            }
            if(i!=j){
                String s = nums[i] + "->" + nums[j];
                list.add(s);
            }
            i = j+1;
            j = i;
        }
        return list;
    }
}