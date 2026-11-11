class Solution {
    public int compress(char[] arr) {
        int n = arr.length;
        int i = 0;
        int j = 0;
        int k = 0;
        if(n==1) return 1;
        while(i<n){
            while(j<n && arr[i]==arr[j]){
                j++;
            }
            int len = j-i;  
            arr[k] = arr[i];
            k++;
            if(len>1) {
                String s1 = String.valueOf(len);
                for(int l=0;l<s1.length();l++){
                    arr[k] = s1.charAt(l);
                    k++;
                }
            
            }
            i = j;
            
        }
        return k;
    }
}