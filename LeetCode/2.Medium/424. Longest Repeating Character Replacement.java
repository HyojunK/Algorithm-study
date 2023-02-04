class Solution {
    // 알파벳의 개수를 카운팅할 배열
    int[] alphabet = new int[26];

    public int characterReplacement(String s, int k) {
        // 탐색 범위 내 가장 많이 나온 문자 개수
        int max = 0;
        // 첫 번째 문자 개수를 증가
        alphabet[s.charAt(0) - 'A']++;
        // 탐색중인 문자 범위의 왼쪽 인덱스값
        int left = 0;
        
        // 두 번째 문자부터 문자열의 길이만큼 탐색
        for(int i = 1; i < s.length(); i++) {
            // 현재 탐색중인 문자의 사용 개수 증가
            alphabet[s.charAt(i) - 'A']++;
            max = mostFreqVal();
            
            // 현재 탐색중인 범위에서 가장 많이 사용된 알파벳을 뺀 개수,
            // 즉 바꿔야할 알파벳의 개수가 k보다 큰 경우
            if(i - left + 1 - max > k) {
                // 왼쪽 인덱스에 해당하는 알파벳 사용 개수를 감소
                alphabet[s.charAt(left) - 'A']--;
                // 탐색할 왼쪽 인덱스를 증가시킴
                left++;
            }
        }
        
        // 문자열의 길이에서 왼쪽 인덱스를 뺀 값을 return
        return s.length() - left;
    }

    // 현재 탐색중인 범위내에서 가장 많이 사용된 알파벳의 개수를 반환
    public int mostFreqVal() {
        int result = 0;
        
        for(int i : alphabet) {
            result = Math.max(result, i);
        }
        
        return result;
    }
}