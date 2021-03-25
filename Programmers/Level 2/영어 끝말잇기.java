import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};

        //단어 중복 체크를 위한 맵
		Map<String, Integer> map = new HashMap<>();
		
        //사람 수 만큼 블록으로 탐색
		for(int i = 0; i < words.length; i += n) {
            
			//범위가 words의 길이를 초과하면 words의 길이까지만, 초과하지 않으면 n번 탐색
			int size = (i + n) > words.length? words.length : i + n;
            
			for(int j = i; j < size; j++) {
				if(j != 0) {
					String s1 = words[j - 1]; //이전 단어
					String s2 = words[j]; //현재 단어
					
					char last = s1.charAt(s1.length() - 1); //이전 단어의 마지막 철자
					char first = s2.charAt(0); //현재 단어의 처음 철자
					
					if(map.containsKey(s2) || last != first) { //단어가 중복이거나 철자가 이어지지 않는 경우
						answer[0] = (j % n) + 1; //번호
						answer[1] = (i / n) + 1; //차례
						
						return answer;
					}
				}
				
				map.put(words[j], 1);
			}
		}

        return answer;
    }
}