class Solution {
    boolean[] prime = new boolean[101];
    
    public int solution(int n) {
        int answer = 0;
        
        getPrime();
        for(int i = 0; i <= n; i++){
            if(i < 4) continue;
            if(prime[i]) answer++;
        }
        
        return answer;
    }
    
	public void getPrime() {
		prime[0] = prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i]) {
				continue;
			}
			for(int j = i+i; j < prime.length; j+= i) {
				prime[j] = true;
			}
		}
	}
}