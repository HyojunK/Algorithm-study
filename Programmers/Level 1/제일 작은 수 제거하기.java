import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
      
		int min = Integer.MAX_VALUE;
		
		List<Integer> list = new ArrayList<>();
		
		if(arr.length == 1) {
			int[] answer = {-1};
            return answer;
		}
        
		for(int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		int min_index = list.indexOf(Collections.min(list));
		list.remove(min_index);
		
		int[] answer = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
        
        return answer;
    }
}