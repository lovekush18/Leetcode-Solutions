class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i+=2){
            int fr = nums[i];
            int val = nums[i+1];
            for(int j=0;j<fr;j++){
                list.add(val);
            }
        }
        int[] arr = new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}