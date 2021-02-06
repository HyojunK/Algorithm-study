import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        long[] arr = new long[(int)Math.log10(n) + 1];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = n%10;
			n /= 10;
		}
		Arrays.sort(arr);
		for(int i = 0; i < arr.length; i++) {
			answer += arr[i]*Math.pow(10, i);
		}
        
        return answer;
    }
}