class Solution {
    public int heightChecker(int[] heights) {
        int[] arr = heights.clone();
        int count = 0;
        Arrays.sort(arr);
        for(int i=0;i<heights.length;i++){
            if(arr[i]!=heights[i]){
                count++;
            }
            
        }
        return count;
    
    
    }
}