class Solution {
public:
    string minWindow(string s, string t) {
        int m = t.length();
        int n = s.length();
        int minlen = INT_MAX;
        unordered_map<char,int> map1;
        for(int i = 0;i<m;i++){
            char ch1 = t[i];
            if(map1.count(ch1)){
                map1[ch1]++;
            }
            else{
                map1[ch1] = 1;
            }
        }
        unordered_map<char,int> map2;
        int l = 0 , r = 0;
        int count = 0;
        int start = 0;
        while(r<n){
            char ch2 = s[r];
            if(map2.count(ch2)){
                map2[ch2]++;
            }
            else{
                map2[ch2] = 1;
            }

            if(map1.count(ch2) && map1[ch2] == map2[ch2]){
                count++;
            }

            while(count == map1.size()){
                int len = r-l+1;
                if(len<minlen){
                    minlen = len;
                    start = l;
                }

                char ch = s[l];
                int cl = map2[ch];
                if(cl==1){
                    map2.erase(ch);
                }
                else{
                    map2[ch]--;
                }

                if(map1.count(ch) && map2[ch] < map1[ch]){
                    count--;
                }
                l++;
            }
            if(count != map1.size()){
                r++;
            }
            
        }

        if(minlen == INT_MAX){
            return "";
        }
        else{
            return s.substr(start,minlen);
        }
        
    }
};