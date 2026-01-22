class Solution {
    public int countDigits(int num) {
        int count = 0;
        int m = num;

        while(num>0){
            int dig = num%10;
            if(dig!=0 && m%dig==0){
                count++;
            }
            num = num/10;
        }
        return count;
        
    }
}