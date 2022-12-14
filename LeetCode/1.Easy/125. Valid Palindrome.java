class Solution {
    public boolean isPalindrome(String s) {
        // 알파벳과 숫자를 제외한 문자를 ""으로 치환하고 소문자로 변환
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        // 반을 나누어 양쪽 끝부터 탐색
        for(int i = 0; i < s.length() / 2; i++) {
            // 왼쪽 인덱스 : 문자열의 처음부터 시작
            int left = i;
            // 오른쪽 인덱스 : 문자열의 끝부터 시작
            int right = s.length() - 1 - i;
            
            // 왼쪽 문자와 오른쪽 문자가 다르다면 false를 return
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            } 
        }

        return true;
    }
}