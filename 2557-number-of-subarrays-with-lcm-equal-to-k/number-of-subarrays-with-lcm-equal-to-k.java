class Solution {
    public int subarrayLCM(int[] nums, int k) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            int lcm = 1;
            for(int j=i;j<nums.length;j++){
                lcm = lcccm(lcm,nums[j]);
                if(lcm>k){
                    break;
                }
                if(lcm==k){
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
    public static int lcccm(int a , int b){
        int f = hcf(a,b);
        return (a/f)*b;
    }
}