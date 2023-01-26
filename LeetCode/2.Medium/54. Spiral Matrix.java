class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // 행의 길이
        int m = matrix.length;
        // 열의 길이
        int n = matrix[0].length;
        // matrix 배열의 요소 개수 크기만큼의 정답 배열 선언
        List<Integer> answer = new ArrayList<>();
        // 방향에 따라 이동할 x,y좌표 값
        // 오른쪽, 아래, 왼쪽, 위
        int[] dirX = {0, 1, 0, -1};
        int[] dirY = {1, 0, -1, 0};
        // 방향을 나타낼 포인터
        int dir = 0;
        // 시작 x좌표
        int x = 0;
        // 시작 y좌표
        int y = 0;
        
        // matrix 배열 요소의 길이만큼 탐색
        for(int i = 0; i < m * n; i++) {
            // 현재 좌표의 값을 정답 리스트에 추가
            answer.add(matrix[x][y]);
            // 방문 여부를 체크하기위해 배열요소의 최대값인 100보다 큰 값으로 현재 요소값 변경 
            matrix[x][y] = 101;
            
            // 이동한 좌표가 배열을 벗어났거나 이미 방문한 요소인 경우
            if(x + dirX[dir] < 0 || x + dirX[dir] >= m || y + dirY[dir] < 0 || y + dirY[dir] >= n || matrix[x + dirX[dir]][y + dirY[dir]] > 100) {
                // 방향을 변경
                dir = (dir + 1) % 4;
            }
            
            // 좌표 갱신
            x = x + dirX[dir];
            y = y + dirY[dir];
        }

        return answer;
    }
}