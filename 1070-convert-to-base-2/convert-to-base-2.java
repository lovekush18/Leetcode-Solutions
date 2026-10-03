class Solution {
    public String baseNeg2(int n) {
        if(n==0) return "0";
        return binary(n);
    }
    public static String binary(int n){
        if(n==0) return "";
        int no = n%(-2);
        int no2 = n/(-2);
        if(no<0){
            no+=2;
            no2+=1;
        }
        return  binary(no2)+no;
    }
}