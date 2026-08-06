class Solution {
    public int maxScore(int[] arr, int k) {
        int n = arr.length;
        int sum=0;
        int sum1 = 0;
        for(int i=0;i<n;i++){
            sum1+=arr[i];
        }
        for(int i=0;i<n-k;i++){
            sum+=arr[i];
        }
        int minsum = sum;
        for(int i=n-k;i<n;i++){
            sum = sum+arr[i]-arr[i-(n-k)];
            minsum = Math.min(minsum,sum);
        }
        return sum1-minsum;
        
    }
}