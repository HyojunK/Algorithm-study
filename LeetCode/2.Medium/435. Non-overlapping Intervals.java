class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int answer = 0;
        
        // 인터벌 배열의 길이가 1이하인 경우 겹치는 인터벌이 존재할 수 없으므로 0을 return
        if(intervals.length <= 1) return 0;
        
        // 인터벌 종료점 오름차순으로 정렬
        Arrays.sort(intervals, (o1, o2) -> { return o1[1] - o2[1]; });
        
        // 이전 인터벌 종료점
        // 첫 번째 인터벌의 종료점으로 설정
        int prevEnd = intervals[0][1];
        // 두 번째 인터벌부터 탐색 시작
        for(int i = 1; i < intervals.length; i++) {
            // 이전 인터벌 종료점이 현재 인터벌 시작점보다 큰 경우
            if(prevEnd > intervals[i][0]) {
                // 현재 인터벌을 삭제
                answer++;
            } 
            // 이전 인터벌과 현재 인터벌이 겹치지 않는 경우
            else {
                // 이전 인터벌 종료점 갱신
                prevEnd = intervals[i][1];
            }
        }

        return answer;
    }
}