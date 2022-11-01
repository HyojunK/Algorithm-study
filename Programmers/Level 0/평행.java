class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        // 1-2번, 3-4번 좌표를 선택한 경우
        if(getSlope(dots[0], dots[1]) == getSlope(dots[2], dots[3])) return 1;
        // 1-3번, 2-4번 좌표를 선택한 경우
        if(getSlope(dots[0], dots[2]) == getSlope(dots[1], dots[3])) return 1;
        // 1-4번, 2-3번 좌표를 선택한 경우
        if(getSlope(dots[0], dots[3]) == getSlope(dots[1], dots[2])) return 1;
        
        return answer;
    }
    
    // 기울기 구하기
    public float getSlope(int[] dot1, int[] dot2) {
        float xInc = dot2[0] - dot1[0]; // x좌표 증가값
        float yInc = dot2[1] - dot1[1]; // y좌표 증가값
        
        return xInc / yInc;
    }
}