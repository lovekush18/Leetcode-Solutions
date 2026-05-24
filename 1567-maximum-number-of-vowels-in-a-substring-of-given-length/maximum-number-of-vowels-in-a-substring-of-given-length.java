class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int curvowel = 0;
        for(int i = 0; i<k; i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                curvowel++;
            }
        }
        int maxvowel = curvowel;
        for(int i = k; i<n; i++){
            char next = s.charAt(i);
            if(next=='a' || next=='e' || next=='i' |next=='o' || next=='u'){
                curvowel++;
            }
            char prev = s.charAt(i-k);
            if(prev=='a' || prev=='e' || prev=='i' |prev=='o' || prev=='u'){
                curvowel--;
            }
            if(curvowel>maxvowel){
                maxvowel = curvowel;
            }

        }
        return maxvowel;
    }
}