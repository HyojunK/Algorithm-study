class Solution {
    public int partitionString(String s) {
        // 최소 부분 문자열의 개수
        // 문자열의 길이가 1이상이므로 1로 초기화
        int answer = 1;
        // 문자열 탐색중 사용된 글자를 저장할 Map
        Map<Character, Boolean> used = new HashMap<>();
        
        // 문자열의 모든 글자를 탐색
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // 현재 탐색중인 글자가 Map에 포함되어 있는 경우 
            if(used.containsKey(c)){
                // 정답 카운트 증가
                answer++;
                // Map을 초기화 하고 현재 글자 추가
                used.clear();
                used.put(c, true);
            }
            // 현재 탐색중인 글자가 Map에 포함되어 있는 경우 
            else {
                // Map에 현재 글자 추가
                used.put(c, true);
            }
        }

        return answer;
    }
}