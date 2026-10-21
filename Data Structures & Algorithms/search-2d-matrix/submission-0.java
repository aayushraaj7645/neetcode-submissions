class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left =0;
        int m= matrix.length;
        int n = matrix[0].length;
        int right = (m*n)-1;
        if(matrix[0][0]== target || matrix[m-1][n-1]== target){
            return true;
        }

        while(left<=right){

            int mid = right - (right -left)/2;
            int row = mid/n;
            int col = mid % n;

            if(matrix[row][col]== target){
                return true;
            }else if(matrix[row][col] < target){
                left = mid+1;
            }else{
                right = mid-1;
            }

        }
        return false;

    }
}
