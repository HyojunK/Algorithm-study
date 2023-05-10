class Solution {
    public int[][] generateMatrix(int n) {
        // 정답 배열
        int[][] answer = new int[n][n];
        // 현재 이동방향 (오른쪽, 아래, 왼쪽, 위)
        int dir = 0;
        // Row의 이동방향
        int[] dirR = {0, 1, 0, -1};
        // Column의 이동방향
        int[] dirC = {1, 0, -1, 0};
        // 시작 Row
        int row = 0;
        // 시작 Col
        int col = 0;
        
        // 정답 배열의 길이만큼 반복
        for(int i = 0; i < n * n; i++) {
            answer[row][col] = i + 1;
            
            // 다음으로 이동할 좌표가 배열을 벗어나거나 이미 방문한 요소인 경우 이동방향을 변경
            if(row + dirR[dir] < 0 || row + dirR[dir] >= n ||
               col + dirC[dir] < 0 || col + dirC[dir] >= n ||
               answer[row + dirR[dir]][col + dirC[dir]] != 0) {
                dir = (dir + 1) % 4;
            }
            
            // 현재 좌표를 갱신
            row += dirR[dir];
            col += dirC[dir];
        }

        return answer;
    }
}