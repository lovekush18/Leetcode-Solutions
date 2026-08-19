class Solution {
    public double minPrice(int[] p, int[] d) {
        int m = p.length;
        int n = d.length;
        Arrays.sort(p);
        Arrays.sort(d);
        double sum = 0;
        int i = m-1;
        int j = n-1;
        while(i>=0 && j>=0){
            sum+= p[i] * (100.0 - d[j]) / 100.0;
            i--;
            j--;
        }
        while(i >= 0){
        sum += p[i];
         i--;

        }
        return sum;  
    }
}