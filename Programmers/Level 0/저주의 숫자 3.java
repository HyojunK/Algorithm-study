class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n; i++){
            // answer 값 1 증가
            answer++;
            // 3의 배수가 아니고 3이 포함되지 않을 때까지 answer 추가 증가
            while(answer % 3 == 0 || String.valueOf(answer).indexOf("3") != -1){
                answer++;
            }
        }
        
        return answer;
    }
}