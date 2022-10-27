import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        Stack<String> stack = new Stack<>(); // 최종적으로 더할 숫자만 남기기 위한 스택 선언
        StringTokenizer st = new StringTokenizer(s, " "); // 공백을 기준으로 문자열 분리
        while(st.hasMoreTokens()){
            String token = st.nextToken();
            if(token.equals("Z") && stack.size() > 0){ // 스택에 값이 존재하고 현재 토큰이 Z인 경우
                stack.pop(); // 스택에서 마지막 값 제거
            } else if(!token.equals("Z")){ // 현재 토큰이 숫자인 경우
                stack.push(token); // 스택에 추가
            }
        }
        
        while(stack.size() > 0){
            answer += Integer.parseInt(stack.pop()); // 스택에 남아있는 값 모두 더하기
        }
        
        return answer;
    }
}