class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        // 결과값을 저장할 배열
        List<List<Integer>> result = new ArrayList<>();
        // 전달받은 배열이 비어있는 경우 빈 리스트를 return
        if(heights == null || heights.length == 0 || heights[0].length == 0) return result;
        // heights 배열의 행과 열값
        int row = heights.length;
        int col = heights[0].length;
        
        // Pacific Ocean으로 물이 흘러갈 수 있는 섬 여부를 저장할 배열
        boolean[][] pac = new boolean[row][col];
        // Atlantic Ocean으로 물이 흘러갈 수 있는 섬 여부를 저장할 배열
        boolean[][] atl = new boolean[row][col];
        
        // 탐색할 방향 (상,하,좌,우)
        int[][] dirs = {{1,0}, {-1,0}, {0,-1}, {0,1}};
        
        // 각 바다의 좌,우로부터 도달 가능한 섬 탐색
        for (int i = 0; i < row ; i++) {
            dfs(heights, pac, dirs, i, 0);
            dfs(heights, atl, dirs, i, col - 1);
        }
        
        // 각 바다의 위,아래로부터 도달가능한 섬 탐색
        for (int i = 0; i < col ; i++) {
            dfs(heights, pac, dirs, 0, i);
            dfs(heights, atl, dirs, row - 1, i);
        }
        
        // 두 바다로 모두 물이 흘러갈 수 있는 섬 탐색
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(pac[i][j] && atl[i][j]) result.add(Arrays.asList(i,j));
            }
        }

        // 결과값 return
        return result;
    }

    /**
     * @param matrix    탐색할 배열
     * @param ocean     바다의 종류
     * @param dirs      탐색할 방향
     * @param x         x 좌표
     * @param y         y 좌표
     */
    public static void dfs(int[][] matrix, boolean[][] ocean, int[][] dirs, int x, int y){
        // 탐색할 배열의 행과 열
        int row = matrix.length;
        int col = matrix[0].length;
        
        // x,y 좌표값에 해당하는 섬은 ocean으로 부터 접근 가능
        ocean[x][y] = true;
        
        // 모든 방향 탐색
        for(int[] dir: dirs) {
            int newX = x+dir[0]; // x 좌표 이동
            int newY = y+dir[1]; // y 좌표 이동
            // 탐색이 불필요한 상황
            // 1. 새로운 좌표가 배열을 벗어났을 경우
            // 2. 이미 방문가능한 것으로 확인된 좌표인 경우
            // 3. 새로운 좌표의 값이 이전 좌표의 값보다 작은 경우 (물이 흘러갈 수 없는 경우)
            if(newX < 0 || newY < 0 || newX >= row || newY >= col || ocean[newX][newY] || matrix[newX][newY] < matrix[x][y]) continue;
            // 새로운 좌표값에 대해 탐색
            else dfs(matrix, ocean, dirs, newX, newY);
        }
    }
}