class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        if(a == b) answer = a;
        else answer = (((Math.abs(a - b)) + 1) * (long)(a + b)) / 2;
        
        return answer;
    }
}