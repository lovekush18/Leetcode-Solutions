class Solution {
    public int findComplement(int num) {
        return complement(num);
    }

    public int complement(int n) {
        if (n == 0) {
            return 0;
        }
        int flipped = 1 - (n % 2);

        return flipped + 2*complement(n/2);
    }
}