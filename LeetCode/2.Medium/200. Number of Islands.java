class Solution {
    public int numIslands(char[][] grid) {
        // 그리드의 행과 열 값
        int col = grid.length;
        int row = grid[0].length;

        int answer = 0;

        // 그리드의 각 셀을 탐색
        for(int i = 0; i < col; i++){
            for(int j = 0; j < row; j++){
                // 해당 좌표가 땅(1)인 경우
                if(grid[i][j] == '1'){
                    // 정답 카운트 증가
                    answer++;
                    // 현재 좌표와 이어진 모든 땅을 탐색
                    dfs(grid, i, j);
                }
            }
        }

        return answer;
    }

    public void dfs(char[][] grid, int x, int y){
        // 좌표가 그리드를 벗어나는 경우 탐색 종료
        if(x < 0 || y < 0 || x >= grid.length || y >= grid[0].length) return;
        // 방문한 타일이 땅(1)인 경우 물(0)로 변경
        // 상하좌우 타일 탐색하며 모든 인접한 땅타일을 물로 변경
        if(grid[x][y] == '1'){
            grid[x][y] = '0';
            dfs(grid, x, y+1);
            dfs(grid, x, y-1);
            dfs(grid, x+1, y);
            dfs(grid, x-1, y);
        }
    }
}