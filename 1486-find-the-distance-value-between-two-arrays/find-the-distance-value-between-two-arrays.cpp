class Solution {
public:
    int findTheDistanceValue(vector<int>& arr1, vector<int>& arr2, int d) {
        int count = 0;
        int m = arr1.size();
        int n = arr2.size();
        for(int i=0;i<m;i++){
            bool flag = true;
            for(int j=0;j<n;j++){
                int l = abs(arr1[i]-arr2[j]);
                if(l<=d){
                   flag = false;
                   break;
                }
            }
            if(flag){
                count++;
            }
        }
        return count;
    }
};