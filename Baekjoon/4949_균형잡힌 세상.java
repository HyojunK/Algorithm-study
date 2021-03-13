import java.io.*;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s;
		
		while(true) {
			s = br.readLine();
			if(s.equals(".")) break;
			
			sb.append(solution(s)).append("\n");
		}
		
		System.out.println(sb);
		
	}

	private static String solution(String s) {
		Stack<Character> stack = new Stack<>();
		
		for(int j = 0; j < s.length(); j++) {
			char c = s.charAt(j);
			
			//여는 괄호일 경우
			if(c == '(' || c == '[') {
				stack.push(c);
			}
			
			// 닫는 소괄호일 경우
			else if(c == ')') {
				//스택이 비어있거나 괄호가 매치가 안되는 경우
				if(stack.empty() || stack.peek() != '(') {
					return "no";
				}
				else stack.pop();
			}
			
			//닫는 대괄호일 경우
			else if(c == ']') {
				//스택이 비어있거나 괄호가 매치가 안되는 경우
				if(stack.empty() || stack.peek() != '[') {
					return "no";
				}
				else stack.pop();
			}
		}
		if(stack.empty()) {
			return "yes";
		}
		else {
			return "no";
		}
	}

}//class end