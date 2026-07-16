class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                int count = map.get(nums[i]);
                map.put(nums[i],count+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        ArrayList<Integer> list1 = new ArrayList<>(map.keySet());
        int m = list1.size();
        for(int i=0;i<m;i++){
            int ele = list1.get(i);
            int fre = map.get(ele);
            if(fre>n/3){
                list.add(ele);
            }
        }
        return list;
        
        
    }
}