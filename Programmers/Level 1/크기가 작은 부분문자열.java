class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        // 구하려는 부분 문자열의 길이
        int targetLength = p.length();
        
        // 비교대상문자열인 p를 숫자로 변환
        // 길이가 10,000자리 까지이므로 Long타입으로 변환
        long targetNum = Long.parseLong(p);
        // t의 길이에서 구하고자하는 부분문자열의 길이를 뺀만큼 반복
        for(int i = 0; i <= t.length() - targetLength; i++) {
            // 현재 탐색중인 길이가 같은 부분 문자열의 값
            Long sourceNum = Long.parseLong(t.substring(i, i + targetLength));
            // 비교대상값이 타겟값 이하라면 정답카운트 증가
            if(sourceNum <= targetNum) answer++;
        }
        
        return answer;
    }
}