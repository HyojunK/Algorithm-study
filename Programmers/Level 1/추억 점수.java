import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        // 각 이름별 그리움 점수를 저장
        Map<String, Integer> score = new HashMap<>();
        for(int i = 0; i < name.length; i++) {
            score.put(name[i], yearning[i]);
        }
        
        for(int i = 0; i < photo.length; i++) {
            for(String s : photo[i]) {
                // 사진속의 이름별로 그리움 점수를 정답 배열에 추가
                // 이름이 없는 경우 0점
                answer[i] += score.get(s) == null ? 0 : score.get(s);
            }
        }
        
        return answer;
    }
}