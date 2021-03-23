import java.util.*;

class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        
        Stack<Character> stack = new Stack<>();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			//스택이 비어있다면 다음 문자를 추가
			if(stack.empty()) {
				stack.push(c);
			}
			//스택에 문자가 들어있을 때
			else {
				//이전 문자와 현재 문자가 같다면 이전 문자를 제거
				if(stack.peek() == c) {
					stack.pop();
				}
				//다르다면 현재 문자를 추가
				else {
					stack.push(c);
				}
			}
		}
		//스택에 문자가 남아 있지 않다면 성공
		if(stack.size() == 0) answer = 1;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}