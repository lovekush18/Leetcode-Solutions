class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        ArrayList<Integer> list = new ArrayList<>();
        int n = mat[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                
                int up = i==0 ? -1 : mat[i-1][j];
                int down = i==m-1 ? -1 :mat[i+1][j];
                int left = j == 0 ? -1 : mat[i][j-1];
                int right = j == n-1 ? -1 : mat[i][j+1];
                if(mat[i][j]> up && mat[i][j]> down && mat[i][j]> left && mat[i][j]> right){
                    list.add(i);
                    list.add(j);
                    break;
                }
                
            }
            if(list.size()==2) break;
        }
        int[] arr = new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i] = list.get(i);
        }
        return arr;
        
    }
}