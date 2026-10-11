class Solution {
    public int subarrayGCD(int[] nums, int k) {
        int count = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            int gcd = 0;
            for(int j=i;j<n;j++){
                gcd = hcf(gcd,nums[j]);
                if(gcd==k){
                    count++;
                }
            }
        }
        return count;
    }

    public static int hcf(int a , int b){
        if(a==0) return b;
        return hcf(b%a,a);
    }
}