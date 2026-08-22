class Solution {
public:
    bool checkDivisibility(int n) {

        int sum = 0;
        int pro = 1;
        int u = n;
        while(n!=0){
            int digit = n%10;
            sum+=digit;
            pro*=digit;
            n = n/10;
        }
        int sum1 = sum+pro;
        if(u % sum1 ==0){
            return true;
        }
        return false;

        
    }
};