class Solution {
    public int subsetXORSum(int[] nums) {
        ArrayList<ArrayList<Integer>> hey = subset(nums);
        int sum = 0;
        int m = nums.length;
        for(int i = 0;i<hey.size();i++){
            int xor = 0;
            ArrayList<Integer> hlw = hey.get(i);
            for(int j = 0;j<hlw.size();j++){
                xor = xor^hlw.get(j);
            }
            sum = sum+xor;   
        }
        return sum;
    }

    public ArrayList<ArrayList<Integer>> subset(int[] nums) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int m = nums.length;
        int n = 1<<m;
        for(int i = 0;i<n;i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j = 0;j<m;j++){
                if((i & (1<<j))!=0){
                    list.add(nums[j]);
                }
            }
            ans.add(list);
        }
        return ans; 
    }
}