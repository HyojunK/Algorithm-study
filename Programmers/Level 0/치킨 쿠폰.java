class Solution {
    public int solution(int chicken) {
        int answer = 0;
        
        while(chicken > 9){ // 남은 쿠폰이 10장 이상이 되어 서비스 치킨을 받을 수 있을 때 까지 반복
            answer += chicken / 10;                     // 주문한 치킨으로 받을 수 있는 서비스 치킨
            chicken = (chicken / 10) + (chicken % 10);  // 서비스 치킨으로 받은 쿠폰과 남은 쿠폰의 합
        }
        
        return answer;
    }
}