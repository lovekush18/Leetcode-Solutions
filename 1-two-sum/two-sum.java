class Solution {
    public int[] twoSum(int[] nums, int target) {
    //     int sum=0;
    //     int n = nums.length;
    //     for(int i=0;i<n-1;i++){
           
    //         for(int j=i+1;j<n;j++){
                
    //             if(nums[i]+nums[j]==target){
    //                 return new int[]{i,j};
    //             }
    //         }
    //     }
    //     return new int[]{-48489,4949};
        
    //     }
    // }

    int n = nums.length;
    HashMap<Integer,Integer> map = new HashMap<>();
    int[] arr = new int[2];
    for(int i=0;i<n;i++){
        map.put(nums[i],i);
    }
    for(int i=0;i<n;i++){
        if(map.containsKey(target-nums[i]) && map.get(target-nums[i])!=i){
            arr[0] = i;
            arr[1] = map.get(target-nums[i]);
        }
    }
    return arr;
    }
    }

  
