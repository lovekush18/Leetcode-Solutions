class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> st = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        int duplicate = 0;
        int missing = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(st.contains(nums[i])){
                 duplicate = nums[i];
                list.add(duplicate);
                
            }
            else{
               st.add(nums[i]);
            }
        }
        for(int i=0;i<n;i++){
            if(!st.contains(i+1)){
                missing = i+1;
                list.add(missing);
            }
        }
        int u = list.size();
        int[] arr = new int[u];
        for(int i=0;i<u;i++){
            arr[i] = list.get(i);
        }
        return arr;

        
    }
}