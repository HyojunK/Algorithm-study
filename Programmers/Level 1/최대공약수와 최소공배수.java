import java.util.Arrays;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
		
		answer[0] = gcd(n, m);
		//최소공배수 * 최대공약수 = A * B
		answer[1] = (n*m)/answer[0];
		
        return answer;
	}

	//유클리드 호제법
	private static int gcd(int n, int m) {
		if(m == 0) return n;
		
		return gcd(m, n%m);
	}
        
}