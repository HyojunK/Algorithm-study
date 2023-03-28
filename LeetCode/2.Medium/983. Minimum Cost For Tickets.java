class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        // 각 여행일의 최소 비용을 저장할 배열을 선언하고
        // days 배열의 마지막 날짜 + 1 크기로 초기화한다
        int[] costSum = new int[days[days.length - 1] + 1];
        // 실제 여행일에 해당하는 날짜를 저장하기위한 배열 선언 및
        // days 배열에 해당하는 날짜 true로 세팅
        boolean[] travelDay = new boolean[days[days.length - 1] + 1];
        
        for(int day : days) {
            travelDay[day] = true;
        }
        
        for(int i = 1; i < costSum.length; i++) {
            // 여행한 날짜에 포함되지 않는 경우
            if(!travelDay[i]) {
                // 전일 비용을 유지하고 탐색을 계속
                costSum[i] = costSum[i - 1];
                continue;
            }
            
            // 1일 전과 1-day 패스 비용의 합
            // 7일 전과 7-day 패스 비용의 합
            // 30일 전과 30-day 패스 비용의 합 중 가장 작은 값을 현재 비용으로 저장 
            costSum[i] = costSum[i - 1] + costs[0];
            costSum[i] = Math.min(costSum[i], costSum[Math.max(0, i - 7)] + costs[1]);
            costSum[i] = Math.min(costSum[i], costSum[Math.max(0, i - 30)] + costs[2]);
        }
        
        // 마지막 일자의 비용을 return
        return costSum[costSum.length - 1];
    }
}