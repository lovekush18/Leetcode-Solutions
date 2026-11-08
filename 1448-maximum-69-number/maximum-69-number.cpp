class Solution {
public:
    int maximum69Number (int num) {
        int maxi = num;
        string s = to_string(num);
        int n = s.length();
        for(int i=0;i<n;i++){
             s = to_string(num);
            if(s[i]=='6'){
                s[i]='9';
                int ele = stoi(s);
                maxi = max(maxi,ele);
            }
            
        }
        return maxi;;
    }
};