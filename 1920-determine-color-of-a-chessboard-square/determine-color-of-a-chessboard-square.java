class Solution {
    public boolean squareIsWhite(String coordinates) {
        char[] arr = coordinates.toCharArray();
        if((arr[0]+arr[1])%2!=0){
            return true;
        }
        else{
            return false;
        }
        
    }
}