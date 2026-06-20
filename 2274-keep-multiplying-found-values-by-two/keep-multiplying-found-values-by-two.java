class Solution {
    public int findFinalValue(int[] arr, int original) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            int no = arr[i];
            if(no==original){
                original = original*2;
                i = -1;
            }
          
        }
        return original;
        
    }
}