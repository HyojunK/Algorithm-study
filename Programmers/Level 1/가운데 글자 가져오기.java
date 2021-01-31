class Solution {
    public String solution(String s) {
        String answer = "";
        
        //길이가 홀수
		if((s.length()%2) == 1) {
			answer = s.substring(s.length()/2, (s.length()/2) + 1);
		}
		//길이가 짝수
		else {
			answer = s.substring((s.length()/2) - 1, (s.length()/2) + 1);
		}
        
        return answer;
    }
}