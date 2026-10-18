class Solution { 
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generate(n,0,0,"",list);
        return list;
        
    }
    public void generate(int n,int l, int r,String ans, List<String> list) {
        if(r==n){
            list.add(ans);
            return;
        }
        if(l<n){
            generate(n,l+1,r,ans+"(",list);
        }
        if(r<n && r<l){
            generate(n,l,r+1,ans+")",list);
        }
        
    }

}