class Solution {
    public int mostFrequentEven(int[] nums) {
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
        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        int m = list.size();
        int maxfre = Integer.MIN_VALUE;
        int ans = -1;
        for(int i=0;i<m;i++){
            int ele = list.get(i);
            int fre = map.get(ele);
            if(ele%2==0){
                if(fre>maxfre){
                maxfre = fre;
                ans = ele;
                }
                if(fre==maxfre){
                   ans = Math.min(ele,ans);
                }
            }
           
        }
        return ans;
        
    }
}