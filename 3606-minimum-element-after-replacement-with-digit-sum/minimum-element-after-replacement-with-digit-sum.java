class Solution {
    public int minElement(int[] nums) {
        int n = nums.length;
        int minno = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int sum = 0;
            int digit = nums[i];
            while(digit!=0){
                int l = digit%10;
                sum+=l;
               
                
                digit = digit/10;
            }
             if(sum<minno){
                minno = sum;
             }
        }
        
        return minno;
        
    }
}