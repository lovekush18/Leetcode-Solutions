class Solution {
    public List<Boolean> kidsWithCandies(int[] nums, int e) {
        List<Boolean> list = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            int sum = nums[i]+e;
            boolean flag = true;
            for(int j=0;j<n;j++){
                if(!(sum>=nums[j])){
                    flag = false;
                    list.add(false);
                    break;
                }
              
            }if(flag==true){
            list.add(true);
            }
    
        }
        return list;
        
    }
}