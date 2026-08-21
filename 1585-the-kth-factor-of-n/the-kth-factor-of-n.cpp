class Solution {
public:
    int kthFactor(int n, int k) {
        vector<int> vec;

        for(int i = 1;i*i<=n;i++){
            if(n%i==0){
                vec.push_back(i);
                if(i!=n/i){
                    vec.push_back(n/i);
                }
            }
        }
        sort(vec.begin(),vec.end());
        if(vec.size()<k) return -1;
        return vec[k-1];
        
        
        
    }
};