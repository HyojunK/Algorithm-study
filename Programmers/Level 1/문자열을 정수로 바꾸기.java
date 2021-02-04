class Solution {
    public int solution(String s) {
        int answer = 0;
        boolean plus = true;
		
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch == '-') plus = false;
			else if(ch != '+'){
				answer = answer * 10 + (ch - '0');
			}
		}
		if(plus == false) answer *= -1;
        
        return answer;
    }
}