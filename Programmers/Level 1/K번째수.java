import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        
        answer = new int[commands.length];
		
		for(int i = 0; i < answer.length; i++) {
			int[] copy = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
			Arrays.sort(copy);
			answer[i] = copy[commands[i][2] - 1];
		}
        
        return answer;
    }
}