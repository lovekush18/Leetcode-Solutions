class Solution {
    public String capitalizeTitle(String s) {
        int n = s.length();
        String[] arr = s.split(" ");
        for(int i=0;i<arr.length;i++){
            String s1 = arr[i]; 
            if(s1.length()==1 || s1.length()==2){
                s1 = s1.toLowerCase();
            }
            else{
                s1 = Character.toUpperCase(s1.charAt(0))+s1.substring(1).toLowerCase();
            }
            arr[i] = s1;
        }
        return String.join(" ",arr);
    }
}