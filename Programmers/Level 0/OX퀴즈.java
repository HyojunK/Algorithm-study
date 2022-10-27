import java.util.*;

class Solution {
    Queue<String> queue = new LinkedList<>(); // 계산식을 체크 하기 위한 queue 선언
    
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++){
            answer[i] = checkExpression(quiz[i]);
        }
        
        return answer;
    }
    
    // 계산식 확인
    public String checkExpression(String expression){
        String result = "O";
        queue.clear(); // queue 초기화
        
        StringTokenizer st = new StringTokenizer(expression, " "); // 공백을 기준으로 문자열 분리
        while(st.hasMoreTokens()){
            queue.offer(st.nextToken());
        }
        
        int value = 0; // 문자열 계산 결과값
        while(queue.size() > 0){
            String s = queue.poll();
            switch(s){
                case "+" : 
                    value += Integer.parseInt(queue.poll()); // 다음 요소를 꺼내서 더하기
                    break;
                case "-" : 
                    value -= Integer.parseInt(queue.poll()); // 다음 요소를 꺼내서 빼기
                    break;
                case "=" :
                    if(Integer.parseInt(queue.poll()) != value) { // 수식이 옳지 않은경우 결과값 X
                        result = "X";
                    }
                    break;
                default :
                    value += Integer.parseInt(s); // 맨 처음 숫자가 왔을 경우 결과 값 증가
            }
        }
        
        return result;
    }
}