class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(String s : tokens) {
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int y = stack.pop();
                int x = stack.pop();
                stack.push(calculate(x, y, s));
            }
            else {
                stack.push(Integer.parseInt(s));
            }
        }

        return stack.pop();
    }

    public int calculate(int x, int y, String operator) {
        int result = x;

        if(operator.equals("+")) {
            result += y;
        }
        else if(operator.equals("-")) {
            result -= y;
        }
        else if(operator.equals("*")) {
            result *= y;
        }
        else if(operator.equals("/")) {
            result /= y;
        }

        return result;
    }
}