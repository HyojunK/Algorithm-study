class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(n >= a){
            answer += n / a * b;        // 현재 콜라로 받을 수 있는 보너스 콜라의 수
            n = (n / a * b) + n % a;    // 보너스로 받은 콜라와 현재 남아있는 콜라의 합
        }
        
        return answer;
    }
}