class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = num;
        
		while(answer <= 500) {
			if(n == 1) return answer;
            n = (n%2 == 0)? n/2 : n*3 + 1;
			answer++;
		}
		
        return -1;
    }
}