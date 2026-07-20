class Solution {
    public int findMaxLength(int[] nums) {
        
        // int maxlen = 0;
        // for(int i=0;i<n;i++){
        //     int zeroscount = 0;
        //     int onescount = 0;
        //     for(int j=i;j<n;j++){
        //         if(nums[j]==0){
        //             zeroscount++;
        //         }
        //         else if(nums[j]==1){
        //             onescount++;
        //         }
        //         if(zeroscount==onescount){
        //             maxlen = Math.max(maxlen,j-i+1);
        //         }
        //     }
        // }
        // return maxlen;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                nums[i] = 1;
            }
            else if(nums[i]==1){
                 nums[i] = -1;
            }
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum = 0;
        
        int maxlen = 0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
           if(map.containsKey(sum)){
            int value = map.get(sum);
            int curlen = i-value;
            maxlen = Math.max(curlen,maxlen);
           }

           else{
            map.put(sum,i);
           }
       
        }
        return maxlen;

    }
} 