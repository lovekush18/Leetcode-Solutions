class Solution {
    public boolean canAliceWin(int n) {
        return fun(n, 10,true);

    }
    public boolean fun(int n , int remove, boolean flag){
        if(remove>n){
            return !flag;
        }
        return fun(n-remove , remove-1, !flag);
    }
}