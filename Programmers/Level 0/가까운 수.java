import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        int min = 100;
        Arrays.sort(array);
        for(int i : array){
            if(Math.abs(i - n) < min){
                answer = i;
                min = Math.abs(i - n);
            } else {
                break;
            }
        }
        
        return answer;
    }
}