class Solution {
    public int solution(int n, int m, int[] section) {
        // 최소한 한 구역은 다시 칠해야하므로 정답 카운트 1로 초기화
        int answer = 1;
        
        // 칠할 구역의 시작 인덱스
        int start = 0;
        // 칠할 구역의 종료 인덱스
        int end = 0;
        
        // 다시 칠해야할 구역을 모두 탐색할 때까지 반복
        while(end < section.length){
            // 칠해야 하는 범위가 롤러의 길이보다 작으면
            if(section[end] - section[start] < m) {
                // 종료인덱스를 증가
                end++;
            }
            else {
                // 시작인덱스를 종료인덱스까지 이동
                start = end;
                // 정답카운트 증가
                answer++;
            }
        }
        
        return answer;
    }
}