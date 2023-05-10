class Solution {
    public int diagonalSum(int[][] mat) {
        // 대각선 요소의 총 합계
        int sum = 0;

        // 배열의 길이
        int length = mat.length;

        // 배열의 길이가 1인 경우 요소를 바로 return
        if(length == 1) return mat[0][0];

        // 배열의 길이만큼 반복
        for(int i = 0; i < length; i++){
            // primary diagonal
            sum += mat[i][i];

            // secondary diagonal
            // 배열의 길이가 홀수 이면서 길이의 절반에 해당하는 인덱스인 경우
            // 중복된 요소가 선택되므로 탐색제외
            if(length % 2 == 1 && i == length / 2) continue;
            // 이외의 경우 합계에 더함
            sum += mat[i][length - i - 1];
        }

        return sum;
    }
}