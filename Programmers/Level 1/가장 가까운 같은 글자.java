import java.util.*;

class Solution {
    public int[] solution(String s) {
        // 문자열 길이만큼의 정답 배열 생성
        int[] answer = new int[s.length()];
        
        // 탐색할 문자열과 인덱스를 저장할 Map
        Map<Character, Integer> charMap = new HashMap<>();
        
        // 문자열의 각 문자 탐색
        for(int i = 0; i < s.length(); i++) {
            // 현재 탐색중인 문자
            char c = s.charAt(i);
            
            // 현재 탐색중인 문자가 이미 나왔던 문자인 경우
            if(charMap.containsKey(c)) {
                // 현재 인덱스에서 문자가 등장했던 인덱스를 뺀만큼의 값을 정답배열에 추가
                answer[i] = i - charMap.get(c);
            }
            // 현재 탐색중인 문자가 처음 나온 경우
            else {
                // 정답 배열에 -1추가
                answer[i] = -1;
            }
            // Map에 현재 문자와 인덱스 갱신
            charMap.put(c, i);
        }
        
        return answer;
    }
}