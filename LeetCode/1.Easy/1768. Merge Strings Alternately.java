class Solution {
    public String mergeAlternately(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < Math.max(length1, length2); i++){
            if(i < length1) sb.append(word1.charAt(i));
            if(i < length2) sb.append(word2.charAt(i));
        }

        return sb.toString();
    }
}