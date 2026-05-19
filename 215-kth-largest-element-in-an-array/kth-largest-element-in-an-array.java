class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n-k+1;i++){
            st.push(nums[i]);
        }
        int m = st.peek();
        return m;
    }
}