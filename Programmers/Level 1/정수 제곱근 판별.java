class Solution {
    public long solution(long n) {
        long answer = 0;
        
        long l = (long)Math.sqrt(n);
		answer = (n == Math.pow(l, 2))? (long)Math.pow(l + 1, 2) : -1;
        
        return answer;
    }
}