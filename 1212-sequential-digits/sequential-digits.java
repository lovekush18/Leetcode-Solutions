class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();
        String s = "123456789";
        String s1 = String.valueOf(low);
        String s2 = String.valueOf(high);
        int m = s1.length();
        int n = s2.length();
        for(int i=m;i<=n;i++){
            for(int j=0;j+i<=9;j++){
                String s3 = s.substring(j,j+i);
                int u = Integer.parseInt(s3);
                if(u>=low && u<=high)
                list.add(u);
            }
        }
        return list; 
    }
}