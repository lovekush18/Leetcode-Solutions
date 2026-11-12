class Solution {
public:
    int fib(int n) {
        vector<int> vec(n+1);
        return fun(n,vec);
    }
    int fun(int n , vector<int> &vec){
        if(n==0 || n==1) return n;
        if(vec[0]!=0) return vec[0];
        int ans = fun(n-1,vec)+fun(n-2,vec);
        vec[n] = ans;
        return vec[n];
    }
};