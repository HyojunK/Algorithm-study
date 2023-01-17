class Solution {
    public int lengthOfLongestSubstring(String s) {
        // 문자열 최대 길이
        int maxLength = 0;
        // 이미 나온 문자를 탐색하기 위한 map
        // 탐색한 문자와 그 문자의 인덱스를 저장
        Map<Character, Integer> map = new HashMap<>();
        int start = 0;  // 탐색할 문자열의 시작 인덱스
        int end = 0;    // 탐색할 문자열의 종료 인덱스
        
        // 문자열을 끝까지 탐색하거나
        // 탐색할 문자열의 길이가 maxLength 이하가 될 때 까지 반복
        while(end < s.length() && maxLength <= s.length() - start) {
            char letter = s.charAt(end);
            // 처음 탐색하는 문자인 경우
            if(map.get(letter) == null) {
                // map에 현재 탐색중인 문자와 그 인덱스 값을 저장
                map.put(letter, end);
            }
            // 이미 탐색했던 문자인 경우
            else {
                // 이전에 등장했던 인덱스 다음 인덱스와 현재 start 인덱스 중 큰값으로 start 인덱스를 갱신
                start = Math.max(map.get(letter) + 1, start);
                // 현재 문자의 인덱스를 갱신
                map.put(letter, end);
            }
            // 현재 만들어진 문자열의 길이와 최대 길이를 비교하여 최대 길이 갱신
            maxLength = Math.max(maxLength, end - start + 1);
            end++; // 종료 인덱스 증가
        }
        
        // 최대 문자열의 길이를 return
        return maxLength;
    }
}