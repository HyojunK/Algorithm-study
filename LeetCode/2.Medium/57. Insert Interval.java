class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        // 새로 합친 인터벌을 저장할 리스트
        List<int[]> resultList = new ArrayList<>();
        // 모든 인터벌 탐색
        for(int[] interval : intervals) {
            // 합칠 대상 인터벌의 시작점이 탐색중인 인터벌의 종료점보다 큰 경우
            if(newInterval[0] > interval[1]) {
                // 현재 탐색중인 인터벌을 리스트에 추가
                resultList.add(interval);
            }
            // 탐색중인 인터벌의 시작점이 합칠 대상 인터벌의 종료점보다 큰 경우
            else if(interval[0] > newInterval[1]){
                // 합칠 대상 인터벌을 리스트에 추가
                resultList.add(newInterval);
                // 합칠 대상 인터벌을 현재 탐색 인터벌로 갱신
                newInterval = interval;
            }
            // 현재 탐색중인 인터벌과 합칠 대상 인터벌이 겹치는 경우
            else {
                // 합칠 대상 인터벌의 시작점과 종료점을 각각 최소, 최대값으로 갱신
                newInterval[0] = Math.min(interval[0], newInterval[0]);
                newInterval[1] = Math.max(interval[1], newInterval[1]);
            }
        }
        
        // 마지막 남은 인터벌을 리스트에 추가
        resultList.add(newInterval);
        
        // 리스트를 배열로 변환하여 반환
        return resultList.toArray(new int[resultList.size()][]);
    }
}