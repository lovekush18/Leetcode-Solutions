class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] copy = arr.clone();
        Arrays.sort(copy);
        int m = copy.length;
        int[] arr1 = new int[m];
        HashMap<Integer,Integer> map = new HashMap<>();
        int rank = 1;
        for(int i=0;i<m;i++){
            if(!map.containsKey(copy[i])){
                map.put(copy[i],rank);
                rank++;
            }   
        }
        for(int i=0;i<m;i++){
            arr[i] = map.get(arr[i]);
        }
        return arr;
        
    }
}