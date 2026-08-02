class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        arr[0] = 0;
        for(int i =1;i<=n;i++){
            int tem = i;
            int count = 0;
            while(tem!=0){
                if((tem & 1)==1){
                count++;
                }
                tem = tem>>1;
                
            }
            arr[i] = count;
        }
        return arr;
        
        
    }
}