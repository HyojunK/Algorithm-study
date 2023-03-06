class Solution {
    public int solution(String s) {
        int answer = 0;
        
        // 첫 글자 x
        char x = s.charAt(0);
        // 첫 글자 x와 x가 아닌 글자가 나온 횟수의 차이
        int cnt = 0;
        
        // 모든 문자 탐색
        for(int i = 0; i < s.length(); i++) {
            // 현재 탐색중인 글자가 x와 같으면 카운트 증가
            if(s.charAt(i) == x) cnt++;
            // 현재 탐색중인 글자가 x와 같지않으면 카운트 감소
            else cnt--;
            // x와 x가 아닌 글자가 나온 횟수 차이가 0인경우
            if(cnt == 0) {
                // 현재 글자가 마지막 글자가 아닐 때
                if(i < s.length() - 1) {
                    // 첫 글자 x를 다음 글자로 갱신
                    x = s.charAt(i + 1);                    
                }
                // 정답 카운트 증가
                answer++;                
            }
        }
        
        // 탐색 종료 후 문자가 남아있는 경우 정답카운트 증가
        if(cnt != 0) answer++;
        
        return answer;
    }
}