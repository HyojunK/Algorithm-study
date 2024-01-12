class Solution {
    public boolean halvesAreAlike(String s) {
        Set<Character> vowels = Set.of('a','e','i','o','u','A','E','I','O','U');
        int cnt = 0;
        char[] cArr = s.toCharArray();

        // 앞 부분 탐색
        for(int i = 0; i < s.length() / 2; i++) {
            if(vowels.contains(cArr[i])) cnt++;
        }

        // 뒷 부분 탐색
        for(int i = s.length() / 2; i < s.length(); i++) {
            if (vowels.contains(cArr[i])) cnt--;
        }

        return cnt == 0;
    }
}