class Solution {
    public int sumFourDivisors(int[] nums) {

        int sum = 0;
        int m = nums.length;
        for(int j = 0;j<m;j++){
            int n = nums[j];
            int count = 0;
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 1;i<=n/i;i++){
                if(n%i==0){
                    count++;
                    list.add(i);
                    if(i!=(n/i)){
                        count++;
                        list.add(n/i);
                    }
                }
            }
            if(count==4){
                for(int u = 0;u<list.size();u++){
                    int el = list.get(u);
                    sum+=el;
                    
                }
            }
        }
        return sum;
    }

}
