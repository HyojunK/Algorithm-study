class Solution {
    public int minPathSum(int[][] grid) {
        // (0,0) 지점부터 오른쪽 방향으로 탐색
        for(int i = 0; i < grid.length; i++) {
            // 오른쪽 방향 탐색이 끝나면 아래쪽 방향 탐색
            for(int j = 0; j < grid[0].length; j++) {
                // (0,0) 지점은 탐색 제외
                if(i == 0 && j == 0) continue;
                
                // 가장 위쪽 지점 탐색중인 경우
                if(i == 0) {
                    // 현재 지점의 값과 왼쪽 지점의 값의 합을 현재 지점에 저장
                    grid[i][j] += grid[i][j - 1];
                }
                // 가장 왼쪽 지점를 탐색중인 경우
                else if(j == 0) {
                    // 현재 지점의 값과 위쪽 지점의 값의 합을 현재 지점에 저장
                    grid[i][j] += grid[i - 1][j];
                }
                // 그 외의 경우
                else {
                    // 왼쪽 지점의 값과 위쪽 지점의 값 중 최소값을 현재 지점의 값과 더하여 저장
                    grid[i][j] += Math.min(grid[i][j - 1], grid[i - 1][j]);
                }
            }
        }

        return grid[grid.length - 1][grid[0].length - 1];
    }
}