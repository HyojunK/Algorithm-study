import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        int before = -1;
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != before) {
				list.add(arr[i]);
				before = arr[i];
			}
		}
		answer = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}