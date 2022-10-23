import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        Map<Integer, Integer> map = new HashMap<>();
        int[] copyArr = emergency.clone();
        Arrays.sort(copyArr);
        for(int i = 0; i < copyArr.length; i++){
            map.put(copyArr[i], copyArr.length - i);
        }
        for(int i = 0; i < emergency.length; i++){
            answer[i] = map.get(emergency[i]);
        }
        return answer;
    }
}