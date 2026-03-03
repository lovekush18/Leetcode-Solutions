class Solution {
    // public int fib(int n) {
    //     return fibo(n);
        
    // }
    // public int fibo(int n) {
    //   if(n==0){
    //         return 0;
    //     }
    //     if(n==1){
    //         return 1;
    //     }
        
    //     return fibo(n-1)+fibo(n-2);
    public int fib(int n) {
        if(n==0) return 0;
        else if(n==1) return 1;
    int n1 = 0;
    int n2 = 1;
    int sum = 0;
    for(int i = 2; i<=n;i++){
         sum = n1+n2;
        n1 = n2;
        n2 = sum;
    }
    return sum;
    }
}