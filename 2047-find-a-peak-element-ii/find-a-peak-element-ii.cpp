class Solution {
public:
    vector<int> findPeakGrid(vector<vector<int>>& arr) {
        int m = arr.size();
        int n = arr[0].size();
        vector<int> list;
        int low = 0 , high = n-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            int max = INT_MIN;
            int in = -1;
            for(int i=0;i<m;i++){
                if(arr[i][mid]>max){
                    max = arr[i][mid];
                    in = i;
                }
            }
            if(n==1){
                list.push_back(in);
                list.push_back(mid);
                break;

            }
            if(mid==0){
                if(arr[in][mid] >arr[in][mid+1]){
                list.push_back(in);
                list.push_back(mid);
                break;
                }
                else{
                    low = mid+1;
                }
            }

            else if(mid==n-1){
                if(arr[in][mid]>arr[in][mid-1]){
                list.push_back(in);
                list.push_back(mid);
                break;
                }
                else{
                    high = mid-1;
                }

            
            }
            
            else{
               if(arr[in][mid]>arr[in][mid+1] && arr[in][mid]>arr[in][mid-1]){

                list.push_back(in);
                list.push_back(mid);
                break;
               }

               else if(arr[in][mid]<arr[in][mid-1]) {
                high = mid-1;
               }
            
                else{
                    low = mid+1;
                }
            }   
        }
        return list;
    }
};