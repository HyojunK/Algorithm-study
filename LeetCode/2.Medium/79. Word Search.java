class Solution {
    // 좌표의 이동 방향 ( 상, 하, 좌, 우 )
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};

    public boolean exist(char[][] board, String word) {
        boolean result = false;
        int m = board.length;
        int n = board[0].length;
        
        // 배열의 요소 탐색
        for(int i = 0; i < m; i ++) {
            for(int j = 0; j < n; j++) {
                // 찾고자 하는 단어가 존재하는 경우 true를 return
                if(wordSearch(board, word, 0, i, j)) return true;
            }
        }

        return result;
    }

    /**
     * @param board         : 문자를 탐색할 대상 배열
     * @param word          : 찾을 대상 단어
     * @param wordIndex     : 현재 탐색중인 단어의 인덱스
     * @param x             : 배열의 x좌표
     * @param y             : 배열의 y좌표
     * @return
     */
    public boolean wordSearch(char[][] board, String word, int wordIndex, int x, int y) {
        boolean result = false;
        // 단어의 길이만큼 탐색했다면 글자가 존재하므로 true를 return
        if(wordIndex == word.length()) return true;
        // 좌표가 배열을 벗어난다면 false를 return
        if(x < 0 || y < 0 || x >= board.length || y >= board[0].length) return false;
        // 이미 방문했다면 false를 return
        if(board[x][y] == '*') return false;
        // 문자가 일치하지 않는 경우 false를 return
        if(board[x][y] != word.charAt(wordIndex)) return false;
        
        // 방문 표시
        board[x][y] = '*';
        // 상하좌우 탐색
        for(int i = 0; i < 4; i++) {
            result = wordSearch(board, word, wordIndex + 1, x + dx[i], y + dy[i]);
            if(result) break;
        }
        // 방문 표시 해제
        board[x][y] = word.charAt(wordIndex);
        
        // 결과값 return
        return result;
    }
}