class Solution {
    public int maxSatisfied(int[] c, int[] g, int k) {
        int m = c.length;
        int n = g.length;
        int sum = 0;
        for(int i = 0;i<n;i++){
            if(g[i]==0){
                sum+=c[i];
            }
        }
        int maxsum = sum;
        for(int i = 0;i<k;i++){
            if(g[i]==1){
                sum = sum+c[i];
                maxsum = Math.max(maxsum,sum);
                
            }
        }
        for(int i = k;i<n;i++){
            if(g[i]==1){
                sum = sum+c[i];
            }
            if(g[i-k]==1){
                sum = sum-c[i-k];
            }
            maxsum = Math.max(maxsum,sum);
            
        }
        return maxsum;

    }
}