class Solution {
    public int thirdMax(int[] arr) {
        int lar =Integer.MIN_VALUE;
        int seclar = Integer.MIN_VALUE;
        int thirdlar = lar;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        ArrayList<Integer> nums = new ArrayList<>(set);
        int n = nums.size();
        for(int i=0;i<n;i++){
            if(nums.get(i)>lar){
               thirdlar = seclar;
               seclar = lar;
               lar=nums.get(i);
           }
           if(nums.get(i)>seclar && nums.get(i)!=lar){
               thirdlar = seclar;
               seclar=nums.get(i);
           }
           if(nums.get(i)>thirdlar && nums.get(i)!=seclar && nums.get(i)!=lar){
               thirdlar=nums.get(i);
           }
           
       }
       if(set.size()<3){
        thirdlar = lar;
       }

        return thirdlar;
    }
}