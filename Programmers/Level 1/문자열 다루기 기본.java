class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length() == 4 || s.length() == 6) {
			answer = (s.matches("^[0-9]*$"));
		}
		else answer = false;
        
        return answer;
    }
}