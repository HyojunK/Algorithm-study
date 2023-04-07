class Solution {
    int answer = 0;

    public int numEnclaves(int[][] grid) {
        // 그리드 행 개수
        int m = grid.length;
        // 그리드 열 개수
        int n = grid[0].length;

        // 그리드의 가장자리에 땅이 있는 경우 해당 타일과 연결된 땅은 물에 둘러쌓여있지 않게되므로
        // 가장자리를 우선 탐색하여 연결된 모든 땅 타일을 물 타일로 변경
        for(int i = 0; i < n; i++){
            // 가장 윗줄 탐색
            dfs(grid, 0, i, false);
            // 가장 아랫줄 탐색
            dfs(grid, m - 1, i, false);
        }
        for(int i = 1; i < m - 1; i++){
            // 가장 왼쪽줄 탐색
            dfs(grid, i, 0, false);
            // 가장 오른쪽줄 탐색
            dfs(grid, i, n - 1, false);
        }
        // 나머지 안쪽 셀들을 탐색
        for(int i = 1; i < m - 1; i++){
            for(int j = 1; j < n - 1; j++){
                dfs(grid, i, j, true);
            }
        }

        return answer;
    }

    /**
     * @param grid  탐색 대상 그리드
     * @param row   현재 탐색중인 행의 인덱스
     * @param col   현재 탐색중인 열의 인덱스
     * @param inEnclosed 현재 탐색중인 타일이 물로 쌓여있는지 여부
     * @return
     */
    public void dfs(int[][] grid, int row, int col, boolean isEnclosed){
        // 좌표가 그리드를 벗어나는 경우 탐색 종료
        if(row < 0 || col < 0 || row >= grid.length || col >= grid[0].length) return;
        // 방문한 타일이 땅(1)인 경우 물(0)로 변경
        // 물로 둘러 쌓여있는 땅 타일인 경우 정답 카운트 증가
        // 상하좌우 타일 탐색하며 모든 인접한 땅타일을 물로 변경
        if(grid[row][col] == 1){
            grid[row][col] = 0;
            if(isEnclosed) answer++;
            dfs(grid, row, col+1, isEnclosed);
            dfs(grid, row, col-1, isEnclosed);
            dfs(grid, row+1, col, isEnclosed);
            dfs(grid, row-1, col, isEnclosed);
        }
    }
}