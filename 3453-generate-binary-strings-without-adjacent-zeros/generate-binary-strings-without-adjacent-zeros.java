class Solution {
    public List<String> validStrings(int n) {
        List<String> list = new ArrayList<>();
        fun(n,0,0,"",list);
        return list;
    }

    public void fun(int n , int zero,int one,String ans,List<String> list){
        if(ans.length()==n){
            list.add(ans);
            return;
        }
        if(ans.length()==0){
            fun(n,zero+1,one,ans+"0",list);
            fun(n,zero,one+1,ans+"1",list);
            return;
        }
        char lastel = ans.charAt(ans.length()-1);
        if(lastel=='0'){
            fun(n,zero,one+1,ans+'1',list);
        }
        else{
            fun(n,zero+1,one,ans+'0',list);
            fun(n,zero,one+1,ans+'1',list);
        }
    }
}