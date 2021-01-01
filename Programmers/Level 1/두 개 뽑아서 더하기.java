import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        Set<Integer> result = new HashSet<Integer>();
        
        for(int i = 0; i < numbers.length - 1; i++) {
        	for(int j = i + 1; j < numbers.length; j++) {
        		result.add((numbers[i] + numbers[j]));
        	}
        }
        
        answer = new int[result.size()];
        
        Iterator<Integer> iter = result.iterator();
        int i = 0;
        while(iter.hasNext()) {
        	answer[i] = iter.next();
        	i++;
        }
        
        int temp = 0;
        for(int a = 0; a < answer.length - 1; a++) {
        	for(int b = 0; b < answer.length - (1+a); b++) {
        		if(answer[b] > answer[b+1]) {
        			temp = answer[b];
        			answer[b] = answer[b+1];
        			answer[b+1] = temp;
        		}
        	}
        }

        return answer;
    }
}