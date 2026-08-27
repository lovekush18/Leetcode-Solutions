class Solution {
public:
    int countKeyChanges(string s) {
        int n = s.length();
        for(int i = 0;i<n;i++){
            char ch = s[i];
            ch = tolower(ch);
            s[i] = ch;
        }
        int c = 0;
        int i = 0 , j = i+1;
        while(j<n){
            if(s[i]!=s[j]){
                c++;
                
            }
            i++;
            j++;
        }
                
         return c;
            
        
    }
};