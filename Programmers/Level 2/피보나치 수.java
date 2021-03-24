class Solution {
    static int[] data = new int[1000001];
    
    public int solution(int n) {
        int answer = 0;
        
		data[1] = 1;
		answer = fibonacci(n);
        
        return answer;
    }
    
    private static int fibonacci(int n) {
        if(n < 2) return n;
        if(data[n] != 0) return data[n] % 1234567;
		
        return data[n] = (fibonacci(n - 1) + fibonacci(n - 2)) % 1234567;
	}
}