class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        // 1부터 number만큼 반복
        for(int i = 1; i <= number; i++) {
            // i의 약수의 개수
            int divisorCnt = getDivisorCnt(i);
            // 약수의 개수가 제한수치보다 크다면 정해진 파워만큼
            // 약수의 개수가 제한수치보다 작거나 같다면 약수의 개수만큼 정답카운트 증가
            answer += (divisorCnt > limit)? power : divisorCnt;
        }
        
        return answer;
    }
    
    // a의 약수의 개수를 구하는 함수
    public int getDivisorCnt(int a) {
        int cnt = 0;
        
        // a의 제곱근까지 탐색
        for(int i = 1; i <= Math.sqrt(a); i++) {
            // a를 i로 나눈 나머지가 0인 경우 카운트를 2증가 (i와 i로 나눈 몫이 약수가 됨)
            if(a % i == 0) cnt += 2;
            // i가 a의 제곱근인 경우 중복된 값이 들어가므로 카운트 1 감소
            if(i*i == a) cnt--;
        }
        
        return cnt;
    }
}