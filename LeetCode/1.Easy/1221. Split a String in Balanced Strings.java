class Solution {
    public int balancedStringSplit(String s) {
        Stack<Character> stack = new Stack<>();
        int answer = 0;

        for(int i = 0; i < s.length(); i++) {
            if(stack.size() == 0) {
                stack.push(s.charAt(i));
            }
            else if(stack.peek() != s.charAt(i)) {
                stack.pop();
                if(stack.size() == 0) {
                    answer++;
                }
            }
            else {
                stack.push(s.charAt(i));
            }
        }

        return answer;
    }
}