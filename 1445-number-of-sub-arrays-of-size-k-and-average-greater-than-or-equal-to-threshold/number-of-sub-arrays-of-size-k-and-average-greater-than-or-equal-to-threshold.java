class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int cursum = 0;
        for(int i=0;i<k;i++){
            cursum+=arr[i];
        }
        int count = 0;
        double avg = cursum/k;
        if(avg>=threshold){
            count++;
        }
        for(int i=k;i<n;i++){
            int next = arr[i];
            int prev = arr[i-k];
            cursum = cursum+next-prev;
             avg = cursum/k;
            if((avg)>=threshold){
                count++;
            }
        }
        return count;

    }
}