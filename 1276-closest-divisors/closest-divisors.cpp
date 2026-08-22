class Solution {
public:
    vector<int> closestDivisors(int num) {
        vector<int> vec;
        int mindiff = INT_MAX;
        int l = num+1;
        int a = 0;
        int b = 0;
        for(int i=1;i<=l/i;i++){
            if(l%i==0){
                a = i;
                
                b = l/i;
                mindiff = min((abs(a-b)),mindiff);
                
            }
            
        }
        vec.push_back(a);
        vec.push_back(b);

        int u = abs(vec[0]-vec[1]);

        vector<int> vec1;
        int mindiff1 = INT_MAX;
        int m = num+2;
        int a1 = 0;
        int b1 = 0;
        for(int i=1;i<=m/i;i++){
            if(m%i==0){
                a1 = i;
                
                b1 = m/i;
                mindiff = min((abs(a1-b1)),mindiff1);
                
            }
            
        }
        vec1.push_back(a1);
        vec1.push_back(b1);

        int v = abs(vec1[0]-vec1[1]);

        if(u<v) return vec;
        return vec1;
        
    }
};