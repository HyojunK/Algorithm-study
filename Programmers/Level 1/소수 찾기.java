class Solution {
    public boolean[] prime;
    
    public int solution(int n) {
        int answer = 0;
        
        prime = new boolean[n + 1];
		isPrime();
		for(boolean b : prime) {
			if(!b) answer++;
		}
        
        return answer;
    }
    
    public void isPrime() {
		//false이면 소수
		prime[0] = prime[1] = true;
		
		for(int i = 2; i < Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j = i + i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}
}