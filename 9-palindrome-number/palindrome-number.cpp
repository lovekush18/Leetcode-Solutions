class Solution {
public:
    bool isPalindrome(int x) {
        if(x<0) return false;
        return fun(x , x , 0);
    }

    bool fun(int digit , int n ,long long r){
        if(digit==r){
            return true;
        }
        if(n==0){
            return false;
        }
        else{
            return fun(digit,n/10,r*10+n%10);
        }
    }
};