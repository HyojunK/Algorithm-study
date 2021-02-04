class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch == ' ') {
				sb.append(ch);
			}
			else {
				if(ch >= 'A' && ch <= 'Z') {
					ch = ((ch + n) > 'Z')? (char)(ch + n -26) : (char)(ch + n);
				}
				else if(ch >= 'a' && ch <= 'z') {
					ch = ((ch + n) > 'z')? (char)(ch + n -26) : (char)(ch + n);
				}
				sb.append(ch);
			}
		}
        
        return sb.toString();
    }
}