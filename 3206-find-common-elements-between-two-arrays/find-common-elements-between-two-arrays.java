class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
       
       ArrayList<Integer> list = new ArrayList<>();
       HashSet<Integer> h1 = new HashSet<>();
       HashSet<Integer> h2 = new HashSet<>();
       for(int i=0;i<nums1.length;i++){
            h1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            h2.add(nums2[i]);
        }
        int count1 = 0;
        
        for(int i=0;i<nums1.length;i++){
            int num = nums1[i];
            if(h2.contains(num)){
                count1++;
                
            }
            
        }
        list.add(count1);
        int count2 = 0;
        
        for(int i=0;i<nums2.length;i++){
            int num = nums2[i];
            if(h1.contains(num)){
                count2++;
            }
            
        }
        list.add(count2);

        int f = list.size();
        int[] arr = new int[f];
        
        for(int i=0;i<f;i++){
            arr[i] = list.get(i);

        }
        return arr;

    }
}