class Solution {
    public int findComplement(int num) {
        return complement(num, 1);
    }

    public int complement(int n, int place) {
        if (n == 0) {
            return 0;
        }

        int flipped = 1 - (n % 2);

        return flipped * place
                + complement(n / 2, place * 2);
    }
}