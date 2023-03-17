public class Solution {
    public int solution(int n) {
        int ans = 0;

        // 도착 지점부터 반대로 탐색
        // 거리가 0이 될 때까지 반복
        while(n > 0) {
            // 현재 위치가 짝수인 경우 절반위치로 순간이동
            if(n % 2 == 0) {
                n /= 2;
            }
            // 현재 위치가 홀수인 경우 한 칸 전으로 점프, 건전지 사용량 1 증가
            else {
                n--;
                ans++;
            }
        }

        return ans;
    }
}