import java.util.Stack;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        // 재료를 탐색하기위한 스택 선언
        Stack<Integer> stack = new Stack<>();
        
        // 주어진 재료 만큼 반복
        for(int i : ingredient) {
            // 스택에 재료 추가
            stack.add(i);
            
            // 재료가 4개 이상 추가된 경우 햄버거 완성 여부를 탐색
            if(stack.size() >= 4) {
                // 스택에 저장된 위의 4개 재료가 햄버거를 완성시킬 수 있다면
                if(stack.get(stack.size() - 4) == 1 &&
                   stack.get(stack.size() - 3) == 2 &&
                   stack.get(stack.size() - 2) == 3 &&
                   stack.get(stack.size() - 1) == 1) {
                    // 정답 카운트 추가
                    answer++;
                    // 위의 4개의 재료를 꺼냄
                    for(int j = 0; j < 4; j++) {
                        stack.pop();
                    }
                }
            }
        }
        
        return answer;
    }
}