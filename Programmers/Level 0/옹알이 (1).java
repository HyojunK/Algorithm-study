import java.util.*;

class Solution {
    Map<String, Boolean> map = new HashMap<>(); // 발음 가능한 단어 판별을 위한 Map 선언
    
    public int solution(String[] babbling) {
        int answer = 0;
        String[] available = {"aya", "ye", "woo", "ma"}; // 발음 가능한 단어
        
        for(String word : available){
            map.put(word, true);
        }
        for(String word : babbling){
            if(canPronounce(word)) answer++; // 발음이 가능하면 카운트 증가
        }
        
        return answer;
    }
    
    /*
     * 단어 발음 가능 여부 판단
     */
    public boolean canPronounce(String word) {
        int end = 1;
        boolean result = true;
        
        // 단어의 길이가 0이거나 종료 인덱스가 단어 길이를 초과할 때까지 반복
        while(word.length() > 0 && end <= word.length()) {
            // 단어를 앞에서 부터 end 까지 자른 값이 map에 존재하지 않는 경우
            if(map.get(word.substring(0, end)) == null){
                end++; // 종료 인덱스를 증가
            } else { // 단어를 앞에서 부터 end 까지 자른 값이 map에 존재하는 경우
                word = word.substring(end); // 존재하는 단어만큼 잘라내고
                end = 1;                    // 종료 인덱스를 1로 초기화
            }
            if(end > 3) return false;       // 종료 인덱스가 3을 초과하면 false를 반환
                                            // 발음 가능한 단어들 중 가장 긴 단어가 3글자이기 때문
        }
        
        // 최종 단어에 남아있는 문자가 있으면 발음할 수 없는 단어
        if(word.length() > 0) result = false;
        
        return result;
    }
}