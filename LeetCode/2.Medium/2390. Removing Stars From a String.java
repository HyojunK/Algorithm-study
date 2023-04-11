class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();

        // 문자열의 모든 글자 탐색
        for(int i = 0; i < s.length(); i++){
            // 현재 탐색중인 글자
            char c = s.charAt(i);

            // 현재 탐색중인 글자가 '*'인 경우 스택의 가장 마지막 글자를 제거
            if(c == '*') stack.pop();
            // 현재 탐색중인 글자가 알파벳인 경우 스택에 추가
            else stack.push(c);
        }

        // 정답 문자열을 만들기 위한 stringBuilder
        StringBuilder sb = new StringBuilder();

        // 스택에 남아있는 모든 글자 탐색
        while(stack.size() > 0){
            // 스택에서 꺼낸 문자열을 앞쪽에 삽입
            sb.insert(0, stack.pop());
        }

        return sb.toString();
    }
}
