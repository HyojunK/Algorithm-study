class Solution {
    int[][] dp = new int[101][101];
    public int uniquePaths(int m, int n) {
        // 아래쪽이나 오른쪽 끝까지 이동한 경우 이후 이동할 수 있는 경로는 한가지 뿐
        // 아래쪽 끝에 도착 -> 오른쪽으로만 이동
        // 오른쪽  끝에 도착 -> 아래쪽으로만 이동
        if(m == 1 || n == 1) return 1;
        
        // 이미 탐색한 경우 저장된 값 반환
        if(dp[m][n] != 0) return dp[m][n];
        
        // 아래로 이동 + 오른쪽으로 이동
        // 아래로 이동하는 경우 m = 1 감소
        // 오른쪽으로 이동하는 경우 n = 1 감소
        dp[m][n] = uniquePaths(m-1, n) + uniquePaths(m, n-1);
        return dp[m][n];
    }
}