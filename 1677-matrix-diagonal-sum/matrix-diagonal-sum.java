class Solution {
    public int diagonalSum(int[][] mat) {
        int  n = mat.length;
        int sum = 0;
        for(int i =0; i<n; i++){
            //primary
            sum = sum + mat[i][i];
            //secondary
            sum = sum +mat[i][n-i-1];
        }
        // odd sixe matrix
        if(n%2==1){
            sum = sum-mat[n/2][n/2];
        }
        return sum;
        
    }
}