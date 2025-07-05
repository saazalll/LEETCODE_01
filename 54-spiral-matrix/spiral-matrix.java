class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        //left to right
        //top to bottom
        //right to left
        //move to up

        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        //maintain the index

        int top = 0;
        int  bottom = m-1;
        int left = 0;
        int right = n-1;

        while(top<=bottom && left <= right){
            //STEP 1 left to right
            for(int j = left ; j<=right;j++){
                result.add(matrix[top][j]);
            }
            //  shrink the row
            top++;

            //STEP 2 top to bottom
            for(int j = top; j<=bottom; j++){
                result.add(matrix[j][right]);
            }
            // shrink the right column
            right--;

            //STEP 3 right to left
            if(top<=bottom){
            for(int j = right; j>=left; j--){
                result.add(matrix[bottom][j]);
            }
            //shrink the bottom
            bottom--;
            }

            //STEP 4 move to up
            if(left<=right){
                for(int j = bottom; j>=top;j--){
                    result.add(matrix[j][left]);
            }
            //Shrink the left
            left++;

            
            }
            
        }
        return result;
        
    }
}