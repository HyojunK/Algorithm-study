import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        Queue<String> queue = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(my_string, " "); // 공백을 기준으로 문자열 분리
        while(st.hasMoreTokens()){ // queue에 한 글자씩 저장
            queue.offer(st.nextToken());
        }
        
        while(queue.size() > 0){ // queue가 빌 때까지 반복
            String s = queue.poll();
            switch(s){
                case "+" : 
                    answer += Integer.parseInt(queue.poll()); // 다음 요소를 꺼내서 더하기
                    break;
                case "-" : 
                    answer -= Integer.parseInt(queue.poll()); // 다음 요소를 꺼내서 빼기
                    break;
                default :
                    answer += Integer.parseInt(s); // 맨 처음 숫자가 왔을 경우 정답 값을 증가
            }
        }
        
        return answer;
    }
}