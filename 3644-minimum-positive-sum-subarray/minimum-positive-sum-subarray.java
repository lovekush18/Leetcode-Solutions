class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int minsum = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum+=nums.get(j);
                int len = j-i+1;
                if(sum>0 && (len>=l && len<=r)){
                    minsum = Math.min(sum,minsum);
                }
            }
        }
        if(minsum==Integer.MAX_VALUE){
            return -1;
        }
        return minsum;
    }
}