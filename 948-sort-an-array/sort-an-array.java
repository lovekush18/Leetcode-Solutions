class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        
        return mergesort(nums);
    }
    public int[] mergesort(int[] arr){
        int n = arr.length;
        if(n==1) return arr;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        int idx = 0;
        for(int i=0;i<a.length;i++){
            a[i] = arr[idx++];
        }
        for(int i=0;i<b.length;i++){
            b[i] = arr[idx++];
        }
        a = mergesort(a);
        b = mergesort(b);
        return merge(a,b);
    }
    public int[] merge(int[] a , int[] b){
        int m = a.length;
        int n = b.length;
        int i = 0,j = 0, k =0;
        int[] arr = new int[m+n];
        while(i<m && j<n){
            if(a[i]<b[j]){
                arr[k++] = a[i++];
            }
            else{
                arr[k++] = b[j++];
            }
            
        }
        while(i<m){
             arr[k++] = a[i++];
        }
        while(j<n){
            arr[k++] = b[j++];
        }
        return arr;
    }
}