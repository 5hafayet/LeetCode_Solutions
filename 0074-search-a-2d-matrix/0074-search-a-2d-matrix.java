class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowSize = matrix.length;
        int colSize = matrix[0].length;
        for(int i = 0; i < rowSize; i++){
            if(target<=matrix[i][colSize-1])
            {
                for(int j = 0; j < colSize; j++){
                    if(matrix[i][j] == target){
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }
}