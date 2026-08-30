class Solution {
    public int countSpecialIntegers(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> freq = new HashMap<>();
        HashMap<Integer,Integer> fiocc = new HashMap<>();
        HashMap<Integer,Integer> laocc = new HashMap<>();
        int co = 0;
        for(int i = 0;i<n;i++){
            if(freq.containsKey(nums[i])){
                int value = freq.get(nums[i]);
                freq.put(nums[i],value+1);
            }
            else{
                freq.put(nums[i],1);
            }

            if(!(fiocc.containsKey(nums[i]))){
                fiocc.put(nums[i],i);
            }
            laocc.put(nums[i],i);
        }

        ArrayList<Integer> list = new ArrayList<>(freq.keySet());
        for(int i = 0;i<list.size();i++){
            int ele = list.get(i);
            int le = laocc.get(ele)-fiocc.get(ele)+1;
            if(le==freq.get(ele)) co++;
        }
        return co;
    }
}