class Solution {
    static int[] arr;
    public int climbStairs(int n) {
        arr = new int[n+1];
        return climbStairs2(n);
    }
    public int climbStairs2(int n) {
        if(n==1){
        return 1;
        }
        if(n==2){
        return 2;
        }
        if(arr[n]!=0){
            return arr[n];
        }
        arr[n] = climbStairs2(n-1)+climbStairs2(n-2);
        return climbStairs2(n-1)+climbStairs2(n-2);
    }

}