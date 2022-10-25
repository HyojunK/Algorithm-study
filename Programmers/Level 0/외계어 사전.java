class Solution {
    public int solution(String[] spell, String[] dic) {
        for(String word : dic){
            boolean result = true;
            for(String s : spell){
                if(word.indexOf(s) == -1){
                    result = false;
                    break;
                }
            }
            if(result) return 1;
        }
        
        return 2;
    }
}