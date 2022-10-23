import java.util.*;

class Solution {
    public int[] solution(int n) {
        int length = (n / 2) + (n % 2);
        int[] answer = new int[length];
        
        for(int i = 0; i < length; i++){
            answer[i] = 1 + 2 * i;
        }
        
        return answer;
    }
}