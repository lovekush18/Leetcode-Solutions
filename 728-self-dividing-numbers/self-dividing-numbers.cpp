class Solution {
public:
    vector<int> selfDividingNumbers(int left, int right) {

        vector<int> vec;

        for(int i = left ; i<=right;i++){
            bool valid = true;
            int tem = i;
            while(tem!=0){
                int digit = tem%10;
                if(digit ==0 || i%digit!=0){
                    valid = false;
                }
                tem = tem/10;
            }
            if(valid) vec.push_back(i);
        }

        return vec;
        
    }
};