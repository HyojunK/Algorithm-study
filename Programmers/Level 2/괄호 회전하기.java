import java.util.*;

class Solution {
    // 닫는 괄호와 여는 괄호의 짝을 저장할 Map
    Map<Character, Character> pair = new HashMap<>();
    
    public int solution(String s) {
        // 각 닫는 괄호의 짝이 되는 여는 괄호를 Map에 저장
        pair.put(')', '(');
        pair.put(']', '[');
        pair.put('}', '{');
        int answer = 0;
        
        // 문자열 s의 길이만큼 문자열을 회전 시키며 올바른 괄호 문자열 체크
        for(int i = 0; i < s.length(); i++) {
            if(isValid(s, i)) answer++;
        }
        
        return answer;
    }
    
    /**
     * 주어진 괄호 문자열이 올바른 괄호 문자열인지 체크
     * 
     * @param s     판단할 괄호 문자열
     * @param start 탐색을 시작할 위치
     * @return      올바른 괄호 문자열인 경우 true를 return
     */
    public boolean isValid(String s, int start) {
        // 괄호 비교를 위해 사용할 Stack 선언
        Stack<Character> stack = new Stack<>();
        
        // 주어진 문자열의 각 자리 글자 탐색
        for(int i = start; i < start + s.length(); i++) {
            // 현재 탐색중인 글자
            char c = s.charAt(i % s.length());
            
            // Stack이 비어있다면 현재 글자 Stack에 저장하고 다음 글자 탐색
            if(stack.size() == 0) {
                stack.push(c);
                continue;
            }
            
            // 스택에서 꺼낸 글자가 현재 탐색중인 글자와 짝을 이루는 괄호인 경우 스택에서 제거
            if(stack.peek() == pair.get(c)) stack.pop();
            // 그렇지 않은 경우 현재 탐색중인 글자를 Stack에 추가
            else stack.push(c);
        }
        
        // Stack에 남아있는 글자가 없는 경우 올바른 괄호 문자열
        return (stack.size() == 0) ? true : false;
    }
}