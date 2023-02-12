class Solution {
    public int countSubstrings(String s) {
        int answer = 0;
        
        // s의 모든 문자에 대해서 탐색
        for(int i = 0; i < s.length(); i++) {
            // 홀수 길이인 Palindrome 개수
            answer += countPalindrome(s, i, i);
            // 짝수 길이인 Palindrome 개수
            answer += countPalindrome(s, i, i + 1);
        }

        return answer;
    }

    /**
     * @param s         탐색할 문자열
     * @param left      탐색을 시작할 왼쪽 인덱스
     * @param right     탐색을 시작할 오른쪽 인덱스
     * @return
     */
    public int countPalindrome(String s, int left, int right) {
        int count = 0;
        
        // 왼쪽 인덱스와 오른쪽 인덱스가 끝에 도달할 때 까지 반복
        while(left >= 0 && right < s.length()) {
            // 양쪽의 글자가 같은 경우 카운트를 증가시키고 인덱스를 한칸씩 이동
            if(s.charAt(left) == s.charAt(right)) {
                count++;
                left--;
                right++;
            } 
            // 양쪽의 글자가 다른 경우 탐색 종료
            else {
                break;
            }
        }
        
        return count;
    }
}