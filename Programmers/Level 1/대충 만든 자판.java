import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        // targets 배열 길이만큼의 answer 배열
        int[] answer = new int[targets.length];
        // keymap에 있는 문자들의 최소 입력 횟수를 저장할 배열
        int[] minCntArr = new int[26];
        for(int i = 0; i < 26; i++) {
            // keymap 원소의 최대값보다 큰 101로 초기화
            minCntArr[i] = 101;
        }
        
        // keymap의 모든 문자열을 탐색
        for(int i = 0; i < keymap.length; i++) {
            // 현재 탐색중인 문자열
            String s = keymap[i];
            // 각 자리 글자를 탐색
            for(int j = 0; j < s.length(); j++) {
                // 현재 탐색중인 글자
                char c = s.charAt(j);
                // 현재 탐색중인 글자의 최소 입력 횟수를 갱신
                minCntArr[c - 'A'] = Math.min(minCntArr[c - 'A'], j + 1);
            }
        }
        
        // targets의 모든 문자열을 탐색
        for(int i = 0; i < targets.length; i++) {
         // 현재 탐색중인 문자열
            String s = targets[i];
            // 각 자리 글자를 탐색
            for(int j = 0; j < s.length(); j++) {
                // 현재 탐색중인 글자
                char c = s.charAt(j);
                // 현재 탐색중인 글자가 keymap에 존재하지 않는 글자면 -1을 정답배열에 추가하고 헌재 문자열 탐색 종료
                if(minCntArr[c - 'A'] == 101) {
                    answer[i] = -1;
                    break;
                }
                // 존재하는 글자라면 최소 입력 횟수를 정답배열에 더함
                else answer[i] += minCntArr[c - 'A'];
            }
        }
        
        return answer;
    }
}