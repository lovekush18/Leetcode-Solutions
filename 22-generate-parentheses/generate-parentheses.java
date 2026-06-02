class Solution {
    static List<String> list;
    public List<String> generateParenthesis(int n) {
        list = new ArrayList<>();
        generate(n,0,0,"");
        return list;
        
    }
    public void generate(int n,int l, int r,String ans) {
        if(r==n){
            list.add(ans);
            return;
        }
        if(l<n){
            generate(n,l+1,r,ans+"(");
        }
        if(r<l){
            generate(n,l,r+1,ans+")");
        }
        
    }

}