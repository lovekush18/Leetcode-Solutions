class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        int xor = 0;
        ArrayList<Integer> arr = new ArrayList<>(map.keySet());
        for(int i=0;i<arr.size();i++){
            if(map.get(arr.get(i))==2){
                xor^=arr.get(i);
            }
        }
        return xor;
    }
}