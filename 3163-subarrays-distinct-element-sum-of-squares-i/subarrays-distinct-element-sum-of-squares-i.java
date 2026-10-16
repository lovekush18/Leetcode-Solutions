class Solution {
    public int sumCounts(List<Integer> nums) {
        int n = nums.size();
        int sum = 0;
        for(int i=0;i<n;i++){
            int count = 0; 
            HashSet<Integer> set = new HashSet<>();
            for(int j=i;j<n;j++){   
                if(!(set.contains(nums.get(j)))){
                    set.add(nums.get(j));
                    count++;
                    sum+=count*count;
                }
                else{
                    sum+=count*count;
                }
               
            }
        }
        return sum;

    }
}