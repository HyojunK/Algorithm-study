class Solution {
    public int titleToNumber(String columnTitle) {
        int answer = 0;
        int length = columnTitle.length();

        for(char c : columnTitle.toCharArray()) {
            answer += Math.pow(26, length - 1) * (c - 64);
            length--;
        }

        return answer;
    }
}