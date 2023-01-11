class Solution {
    public int[][] merge(int[][] intervals) {
        // intervals 배열의 길이가 1 이하인 경우 merge할 필요가 없으므로 바로 return
        if(intervals.length <= 1) return intervals;
        
        // 인터벌 오름차순 정렬
        Arrays.sort(intervals, (o1, o2) -> { return o1[0] - o2[0]; });

        // 결과 값을 저장할 리스트
        List<int[]> resultList = new ArrayList<>();
        
        // 이전 인터벌 선언 및 intervals 배열의 첫 번째 값으로 설정
        int[] prevInterval = intervals[0];
        
        // 두 번째 요소부터 탐색
        for(int i = 1; i < intervals.length; i++) {
            // 이전 인터벌이 현재 탐색중인 인터벌보다 앞에 있는 경우
            if(prevInterval[1] < intervals[i][0]) {
                // 이전 인터벌을 결과 리스트에 추가
                resultList.add(prevInterval);
                // 이전 인터벌을 현재 탐색중인 인터벌로 갱신
                prevInterval = intervals[i];
            }
            // 이전 인터벌과 현재 탐색중인 인터벌이 겹치는 경우
            else {
                // 이전 인터벌의 종료점을 두 인터벌의 종료점 중 큰 값으로 갱신
                prevInterval[1] = Math.max(prevInterval[1], intervals[i][1]);
            }
        }
        
        // 마지막 남은 인터벌을 리스트에 추가
        resultList.add(prevInterval);
        
        // 리스트를 배열로 변환하여 반환
        return resultList.toArray(new int[resultList.size()][]);
    }
}