class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n  = nums.length;

        if(n==1) return nums[0];
        
        if(nums[0]!=nums[1]){
            return nums[0];
        }

        if(nums[n-1]!=nums[n-2]){
            return nums[n-1];
        }
        int ans = -1;
        int low = 1, high = n-2;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
                ans = nums[mid];
                break;
            }
            else if(mid%2==0){ 
                if(nums[mid]==nums[mid+1]){
                    low = mid+1;
                }
                
                else if(nums[mid]==nums[mid-1]){
                    high = mid-1;
                }
            }
            else{
                if(nums[mid]==nums[mid-1]){
                    low = mid+1;
                }
                
                else if(nums[mid]==nums[mid+1]){
                    high = mid-1;
                }
            }
        }
        return ans;

        // HashMap Approach

        // int n  = nums.length;
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i =0;i<n;i++){
        //     if(map.containsKey(nums[i])){
        //         int c = map.get(nums[i]);
        //         map.put(nums[i],c+1);
        //     }
        //     else{
        //         map.put(nums[i],1);
        //     }
        // }
        // ArrayList<Integer> list = new ArrayList<>(map.keySet());
        // for(int i = 0;i<list.size();i++){
        //     int ele = list.get(i);
        //     int val = map.get(ele);
        //     if(val==1) return ele;
        // }
        // return -1;

        // HashSet Approach
        
        // int n  = nums.length;
        // HashSet <Integer> set = new HashSet<>();
        // for(int i = 0;i<n;i++){
        //     if(set.contains(nums[i])){
        //         set.remove(nums[i]);
        //     }
        //     else{
        //         set.add(nums[i]);
        //     }
        // }
        // ArrayList<Integer> list = new ArrayList<>(set);
        
        // return list.get(0);
   
    }
}

        