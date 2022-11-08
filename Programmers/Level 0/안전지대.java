class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[][] newBoard = new int[board.length][board.length];
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(board[i][j] == 1) {
                    makeDangerArea(newBoard, i, j);
                }
            }
        }
        
        for(int[] row : newBoard) {
            for(int i : row) {
                if(i == 0) answer++;
            }
        }
        
        return answer;
    }
    
    public void makeDangerArea(int[][] board, int row, int col) {
        for(int i = row - 1; i <= row + 1; i++) {
            for(int j = col - 1; j <= col + 1; j++) {
                if(i < 0 || i >= board.length || j < 0 || j >= board.length) continue;
                board[i][j] = 1;
            }
        }
    }
}