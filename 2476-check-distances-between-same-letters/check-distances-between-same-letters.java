class Solution {
    public boolean checkDistances(String s, int[] dis) {
        int m = s.length();
        int n = dis.length;
        for(int i=0;i<m-1;i++){
            for(int j=i+1;j<m;j++){
                if((s.charAt(i))==(s.charAt(j))){
                    int duri = j-i-1;
                    int ind = s.charAt(i)-'a';
                    if(dis[ind]!=duri){
                       return false;
                    }
                    break;
                }
                
            }
        }
        return true;
        
    }
}