class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int answer = 0;

        // 탐색 데이터를 저장할 배열
        // int[첫 번째 문자열의 인덱스][두 번째 문자열의 인덱스]
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];

        // 각각의 문자를 비교하며 탐색
        // 0번 인덱스의 값은 0으로 마진 설정
        for(int i = 1; i <= text1.length(); i++){
            for(int j = 1; j <= text2.length(); j++){
                // 두 문자가 같은 경우
                if(text1.charAt(i - 1) == text2.charAt(j - 1)){
                    // 현재 탐색 문자를 제외한 두 문자열의 최장 부분 수열 값
                    // ex) "abc"와 "ac" -> "ab"와 "a"의 최장 부분 수열 값
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                // 두 문자가 다른 경우
                else {
                    // 현재 탐색 문자를 포함한 두 문자열의 최장 부분수열 값 중 최대값
                    // ex) "abc"와 "ad" -> "abc"와 "a", "ab"와 "ad"의 최장 부분 수열 값 중 최대값
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // 최종 탐색 결과를 반환
        return dp[text1.length()][text2.length()];
    }
}