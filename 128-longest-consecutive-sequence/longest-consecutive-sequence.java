class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
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
        int longest = 0;
        ArrayList<Integer> arr = new ArrayList<>(map.keySet());
        for(int i=0;i<arr.size();i++){
            int count = 0;
            int num = arr.get(i);
            if(!map.containsKey(num-1)){
                int curr = num;
                count++;

                while(map.containsKey(curr+1)){
                    curr++;
                    count++;
                }
            }
            longest = Math.max(longest, count);
             
        }
        return longest;
    }
}