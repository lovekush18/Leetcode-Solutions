class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int fr=0,lr=m-1,fc=0,lc=n-1;
        while(fr<=lr && fc<=lc){
            for(int j=fc ; j<=lc; j++){
                list.add(matrix[fr][j]);
            }
            fr++;
        
            for(int i=fr;i<=lr;i++){
            list.add(matrix[i][lc]);
            }
            lc--;
            if(fr<=lr){
            for(int j=lc ; j>=fc; j--){
                list.add(matrix[lr][j]);
            }
            lr--;
            }
            if(fc<=lc){
            for(int i=lr;i>=fr;i--){
            list.add(matrix[i][fc]);
            }
            fc++;
            }
        }
        return list;
    }
}