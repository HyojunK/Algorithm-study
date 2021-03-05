import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            
            //여는 괄호일 때
            if(c == '('){
                stack.push(c);
            }
            
            //닫는 괄호일 때
            if(c == ')'){
                if(stack.size() == 0){
                    return false;
                }
                else stack.pop();
            }
        }
        if(stack.size() != 0) answer = false;
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}