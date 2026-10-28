class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            int min = Integer.MAX_VALUE;
            for(int j=0;j<n;j++){
                char c1 = s.charAt(j);
                if(c1==c){
                    int dis = Math.abs(i-j);
                    min = Math.min(min,dis);
                }
            }
            arr[i] = min;
        }
        return arr;
    }
}