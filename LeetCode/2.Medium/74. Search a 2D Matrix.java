class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;
        
        while(row < matrix.length && col >= 0) {
            // target과 일치하는 경우
            if(matrix[row][col] == target) return true;
            // 현재 row의 col 값이 target보다 작은 경우 row 증가
            if(matrix[row][col] < target) row++;
            // 현재 row의 col 값이 target보다 큰 경우 col 감소
            else col--;
        }
        
        // 반복 탐색이 모두 끝난 경우 target이 포함되지 않으므로 false를 return
        return false;
    }
}