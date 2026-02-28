class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int c1 = 0 , c2 = 0 , c3 = 0;
        for(int i=0;i<n;i++){
            if(nums[i]==0) c1++;
             else if(nums[i]==1) c2++;
              else if(nums[i]==2) c3++;
        }
        for(int i=0;i<c1;i++){
            nums[i] = 0;
        }
         for(int i=c1;i<c1+c2;i++){
            nums[i] = 1;
        }
         for(int i=c2+c1;i<c1+c2+c3;i++){
            nums[i] = 2;
        }
    //     int low = 0, mid = 0, high = n-1;
    //     while(mid<=high){
    //     if(nums[mid]==0){
    //         swap(nums,low,mid);
    //         low++;
    //         mid++;
    //     }
    //     else if(nums[mid]==1){
            
            
    //         mid++;
    //     }
    //     else{
    //         swap(nums,mid,high);
    //         high--;
    //     }
    //     }

        
    // }
    // public void swap(int[] nums, int i , int j) {
    //     int tem = nums[i];
    //     nums[i] = nums[j];
    //     nums[j] = tem;
    }
}