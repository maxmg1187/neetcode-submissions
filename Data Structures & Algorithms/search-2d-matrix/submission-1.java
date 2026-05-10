class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //two dimensional binary search
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;

        while(top <= bottom){
            int row = (top + bottom) / 2;
            if(target >= matrix[row][0] && target <= matrix[row][matrix[0].length - 1]){
                break;
            }
            else if(target < matrix[row][0]){
                bottom = row - 1;
            }
            else{
                top = row + 1;
            }
        }
        int row = (top + bottom) / 2;
        while(left <= right){
            int mid = (right + left) / 2;
            if(target == matrix[row][mid]){
                return true;
            }
            else if(target < matrix[row][mid]){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return false;
    }
}
