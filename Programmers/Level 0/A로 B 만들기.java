class Solution {
    public int solution(String before, String after) {
        int[] alphabet = new int[26];
        
        for(int i = 0; i < before.length(); i++) {
            alphabet[before.charAt(i) - 97]++;
            alphabet[after.charAt(i) - 97]--;
        }
        
        for(int i : alphabet) {
            if(i != 0) return 0;
        }
        
        return 1;
    }
}