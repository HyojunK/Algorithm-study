import java.io.*;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			sb.append(solution(br.readLine())).append("\n");
		}
		
		System.out.println(sb);
		
	}

	private static String solution(String s) {
		Stack<Character> stack = new Stack<>();
		
		for(int j = 0; j < s.length(); j++) {
			char c = s.charAt(j);
			
			//여는 괄호일 경우
			if(c == '(') {
				stack.push(c);
			}
			//닫는 괄호이나 앞에 열린 괄호가 없는 경우
			else if(stack.empty()) {
				return "NO";
			}
			else {
				stack.pop();
			}
		}
		if(stack.empty()) {
			return "YES";
		}
		else {
			return "NO";
		}
	}
}//class end