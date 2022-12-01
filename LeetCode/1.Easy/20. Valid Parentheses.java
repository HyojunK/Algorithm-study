class Solution {
    public boolean isValid(String s) {
        // 문자열의 길이가 홀수인 경우 남는 괄호가 생기므로  false를 return
        if(s.length() % 2 != 0) {
            return false;
        }

        // 각 여는 괄호에 매칭되는 닫는 괄호
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        
        Stack<Character> stack = new Stack<>();
        
        // 문자열 길이만큼 반복
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // 여는 괄호인 경우
            if(c == '(' || c == '{' || c == '[') {
                // 스택에 추가
                stack.push(c);
            }
            // 닫는 괄호인 경우
            else {
                // 스택의 사이즈가 0이면 false를 return
                if(stack.size() == 0) {
                    return false;
                }
                // 스택에서 꺼낸 괄호와 매칭되는 값이 현재 괄호와 일치하면 스택에서 제거
                if(map.get(stack.peek()) == c) {
                    stack.pop();
                }
                // 스택에서 꺼낸 괄호와 매칭되는 값이 현재 괄호와 일치하지 않는 경우 불완전한 괄호
                else {
                    return false;
                }
            }
        }

        // 스택에 남아있는 값이 없으면 Valid Parentheses이므로 true를 return
        return stack.size() == 0 ? true : false;
    }
}