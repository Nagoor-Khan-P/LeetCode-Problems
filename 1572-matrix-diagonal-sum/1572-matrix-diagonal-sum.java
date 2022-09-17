class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        // to calculate the one diagonal elements sum
        for(int i=0;i<mat.length;i++){
            sum+=mat[i][i];
        }
        
        // loop to find the second diagonal sum
        for(int j=mat[0].length-1;j>=0;j--){
            sum+=mat[mat.length-1-j][j];
        }
        //if length is odd then we will have a common cell which calculated two times
        if(mat.length%2==1){
            sum=sum-mat[mat.length/2][mat.length/2];
        }
        return sum;
    }
}