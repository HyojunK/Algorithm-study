class Solution {
    public void rotate(int[][] matrix) {
        int length = matrix.length;
        // 배열의 값을 교체할 때 사용할 임시 변수
        int temp  = 0;
        
        // 가운데 행을 기준으로 위아래를 반전
        for(int i = 0; i < length/2; i++) {
            for(int j = 0; j < length; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[length - i - 1][j];
                matrix[length - i - 1][j] = temp;
            }
        }
        
        // 왼쪽위부터 오른쪽아래를 잇는 선을 기준으로 반전
        for(int i = 0; i < length; i++) {
            for(int j = i; j < length; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}