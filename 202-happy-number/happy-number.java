class Solution {
    public boolean isHappy(int n) {
        int nn=n;
      HashSet<Integer> set=new HashSet<>();

      if(n==1) return true;

        while(nn!=1){
            if(set.contains(nn)) return false;
            else set.add(nn);
             int sum=0;
        while(nn>0){
           
          int  digit=nn%10;
            sum=sum+(digit*digit);
            nn=nn/10;

        }
        
        nn=sum;
        if(nn==1) return true;
        }


        return false;
   
    }
}