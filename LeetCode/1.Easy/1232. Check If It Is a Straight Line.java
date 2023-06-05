class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        // 배열 길이가 2인 경우에는 항상 직선이므로 true
        if(coordinates.length == 2) return true;

        // 0번째 x좌표
        int x0 = coordinates[0][0];
        // 1번째 x좌표
        int x1 = coordinates[1][0];
        // 0번째 y좌표
        int y0 = coordinates[0][1];
        // 1번째 y좌표
        int y1 = coordinates[1][1];
        // x좌표 변화량
        int dx = x1 - x0;
        // y좌표 변화량
        int dy = y1 - y0;

        for(int i = 2; i < coordinates.length; i++){
            // 현재 x좌표
            int x = coordinates[i][0];
            // 현재 y좌표
            int y = coordinates[i][1];
            // 기울기가 다른 경우 직선이 아니므로 false
            if((x - x0) * dy != (y - y0) *dx) return false;
        }

        // 모든 좌표의 기울기가 같은 경우 직선이므로 true
        return true;
    }
}