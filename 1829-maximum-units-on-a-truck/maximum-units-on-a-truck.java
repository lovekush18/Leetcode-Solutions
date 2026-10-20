class Solution {
    public int maximumUnits(int[][] arr, int truckSize) {
        int m = arr.length;
        Arrays.sort(arr,(a,b)-> Integer.compare(b[1],a[1]));
        int sum = 0;
        for(int i = 0 ;i<m;i++){
            int boxes = Math.min(arr[i][0],truckSize);
            sum+=boxes*arr[i][1];
            truckSize -= boxes;
            if(truckSize==0) break;
        }
        return sum;
 
    }
}