class Solution {
    public int numOfSubarrays(int[] arr) {
        int n = arr.length;
        int evenpresum = 1;
        int oddpresum = 0;
        long count = 0;
        int sum = 0;
        long mod = 1000000007;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum%2==0){
                evenpresum++;
                count+=oddpresum;
            }
            else{
                oddpresum++;
                count+=evenpresum;
            }
        }
        return (int)(count%mod);
        
    }
}