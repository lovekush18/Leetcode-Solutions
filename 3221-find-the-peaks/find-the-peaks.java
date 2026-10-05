class Solution {
    public List<Integer> findPeaks(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<n-1;i++){
            if(arr[i]>arr[i+1] && arr[i]>arr[i-1]){
                list.add(i);
            }
        }
        return list;
        
    }
}