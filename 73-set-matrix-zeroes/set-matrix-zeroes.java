class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;   // row
        int m = matrix[0].length;   // column

        boolean [] row = new boolean[n];
        boolean [] col = new boolean[m];

        //to mark where is the zero in row and col
        for(int i =0; i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == 0){
                    row[i]=true; // row makring
                    col[j]=true; // col marking
                }
            }
        }
        //fill the zero
        for(int i = 0; i<n ; i++){
            for(int j =0; j<m; j++){
                if(row[i]||col[j]){
                    matrix[i][j]=0;
                }
            }
        }

    }
}