class Solution {
    public int maximumWealth(int[][] acc) {
        int m = acc.length;
        int n = acc[0].length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
            int sum = 0;
            for(int j=0;j<n;j++){
                sum = sum+acc[i][j];
            }
            max = Math.max(sum,max);
        }
        return max;

    }
}