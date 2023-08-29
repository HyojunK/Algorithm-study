class Solution {
    public int bestClosingTime(String customers) {
        // 방문 로그를 분리
        char[] visited = customers.toCharArray();
        // 패널티
        int penalty = 0;
        // 최소 패널티
        int minPenalty = 0;
        // 최적 폐점 시간
        int optimalClosingTime = 0;
        
        for(int i = 0; i < visited.length; i++) {
            // i번째의 방문여부가 'Y'인 경우 패널티 감소
            if(visited[i] == 'Y') penalty--;
            // i번째의 방문여부가 'N'인 경우 패널티 증가
            else penalty++;
            
            // 현재 패널티가 최소 패널티보다 작은 경우
            // 최소 패널티 및 최적 폐점 시간 갱신
            if(penalty < minPenalty) {
                minPenalty = penalty;
                optimalClosingTime = i + 1;
            }
        }
        
        // 최소 패널티의 시간을 return
        return optimalClosingTime;
    }
}