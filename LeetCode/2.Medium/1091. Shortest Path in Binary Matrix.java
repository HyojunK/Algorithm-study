class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        // 배열의 길이
        int n = grid.length;
        
        // 배열이 한 칸이고 이동가능한 경우 최단거리 1을 return
        if(grid[0][0] == 0 && n == 1) return 1;
        // 출발점이나 도착점이 이동 불가능한 지점인 경우 경로탐색이 불가능 하므로 -1을 return
        if(grid[0][0] == 1 || grid[n - 1][n - 1] == 1) return -1;
        
        // 탐색할 방향 (왼쪽 위, 중앙 위, 오른쪽 위, 왼쪽, 오른쪽, 왼쪽 아래, 중앙 아래, 오른쪽 아래)
        int[][] dirs = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
        // 탐색에 사용할 큐 선언
        Queue<int[]> q = new LinkedList<>();
        // 큐에 출발점 삽입
        q.offer(new int[] {0, 0});
        // 출발점값을 -1로 방문여부 표시
        grid[0][0] = -1;
        
        // 정답 카운트
        int answer = 0;
        
        // 큐가 빌 때까지 반복
        while(!q.isEmpty()) {
            // 정답 카운트 증가
            answer++;
            // 현재 큐에 있는 모든 요소 탐색
            for(int i = q.size(); i > 0; i--) {
                // 현재 탐색중인 지점
                int[] point = q.poll();
                // 현재 탐색중인 지점의 행 좌표
                int row = point[0];
                // 현재 탐색중인 지점의 열 좌표
                int col = point[1];
                
                // 도착점에 도착한 경우 정답 카운트를 return
                if(row == n - 1 && col == n - 1) return answer;
                
                // 8방향 탐색
                for(int[] dir : dirs) {
                    // 새로운 행 좌표
                    int newRow = row + dir[0];
                    // 새로운 열 좌표
                    int newCol = col + dir[1];
                    // 새로운 좌표가 배열을 벗어나는 경우 탐색 제외
                    if(newRow < 0 || newRow == n || newCol < 0 || newCol == n) continue;
                    // 새로운 좌표가 방문 가능한 좌표가 아니거나 이미 방문한 경우 탐색 제외
                    if(grid[newRow][newCol] != 0) continue;
                    
                    // 현재 좌표 -1로 방문 표시
                    grid[newRow][newCol] = -1;
                    // 큐에 새로운 좌표값 주가
                    q.offer(new int[] {newRow, newCol});
                }
            }
        }

        return -1;
    }
}