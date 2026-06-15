class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<Integer> h1 = new HashSet<>();
        HashSet<Integer> h2 = new HashSet<>();
        int n1 = nums1.length;
        int n2 = nums2.length;
        for(int i=0;i<n1;i++){
            h1.add(nums1[i]);
        }
        for(int i=0;i<n2;i++){
            h2.add(nums2[i]);
        }
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        
         List<Integer> tem1 = new ArrayList<>(h1);
         for(int i=0;i<tem1.size();i++){
            int num = tem1.get(i);
            if(!h2.contains(num)){
                list1.add(num);
            }
         }

         List<Integer> tem2 = new ArrayList<>(h2);
         for(int i=0;i<tem2.size();i++){
            int num = tem2.get(i);
            if(!h1.contains(num)){
                list2.add(num);
            }
         }
         ans.add(list1);
         ans.add(list2);
         return ans;

        
    }
}