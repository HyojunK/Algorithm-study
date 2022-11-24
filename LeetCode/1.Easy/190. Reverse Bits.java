public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int answer = 0;

        for(int i = 0; i < 32; i++){
            // 정답 비트를 왼쪽으로 한칸 이동
            answer <<= 1;
            // 현재 n의 맨 마지막 비트를 정답의 마지막에 추가
            answer |= (n & 1);
            // n의 비트를 오른쪽으로 한 칸 이동
            n >>= 1;
        }

        return answer;
    }
}