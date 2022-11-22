public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int answer = 0;

        // n이 0이 될 때까지 반복
        while(n != 0){
            // 1과의 AND 연산이 1인 경우 맨 오른쪽 자리가 1이므로 카운트 증가
            if((n & 1) == 1) answer++;
            // 비트를 오른쪽으로 한 칸 이동 후 왼쪽 자리는 0으로 채움
            n >>>= 1;
        }

        return answer;
    }
}