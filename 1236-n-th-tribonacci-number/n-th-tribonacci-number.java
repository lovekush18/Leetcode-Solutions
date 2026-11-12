class Solution {
    public int tribonacci(int n) {
        int[] arr = new int[n+1];
        Arrays.fill(arr,-1);
        return fun(n,arr);
    }
    public int fun(int n , int[] arr){
        if(n==0) return 0;
        if(n==1 || n==2) return 1;
        if(arr[n]!=-1) return arr[n];
        int ans = fun(n-1,arr)+fun(n-2,arr)+fun(n-3,arr);
        arr[n] = ans;
        return ans;
    }
}