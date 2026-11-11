class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> list = new ArrayList<>();
        int i= 0,j=0;
        int n = s.length();
        int maxlen = Integer.MIN_VALUE;
        while(i<n){
            
            while(j<n && s.charAt(j)==s.charAt(i)){
              
                j++;
            }
            int len = j-i;
            
            if(len>=3){
                List<Integer> list1 = new ArrayList<>();
                list1.add(i);
                list1.add(j-1);
                list.add(list1);
            }
            i = j;
        }
        return list;
    }
}