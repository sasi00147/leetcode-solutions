class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                //logic for the primary diagonal
                if(i==j){
                    sum=sum+mat[i][j];
                }
                //logic for the secondary diagonal
                if(i+j==mat.length-1 && i!=j){
                    sum=sum+mat[i][j];
                }
            }
        }
        return sum;
        
    }
}
