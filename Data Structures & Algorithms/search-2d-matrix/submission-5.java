class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length ;
        int low = 0, high = (m*n-1);
        System.out.println(low+""+ high+"");
        while(low <= high){
            int mid = low + ( high - low)/2;
            int row = mid/n;
            int col = mid%n;
            System.out.println(matrix[row][col]+"");


            if(matrix[row][col] == target) return true;
            else if(matrix[row][col] < target){
                low = mid+1;
            }
            else if(matrix[row][col] > target){
                high = mid-1;
            }
        }
       return false;
    }
}
