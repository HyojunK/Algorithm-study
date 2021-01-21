import java.util.ArrayList;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] result = new int[3];
        
        for(int i = 0; i < answers.length; i++){
            if(student1[i%student1.length] == answers[i]) result[0]++;
            if(student2[i%student2.length] == answers[i]) result[1]++;
            if(student3[i%student3.length] == answers[i]) result[2]++;
        }
        
        int max = Math.max(Math.max(result[0],result[1]), result[2]);
        ArrayList<Integer> list = new ArrayList<>();
        if(result[0] == max) list.add(1);
        if(result[1] == max) list.add(2);
        if(result[2] == max) list.add(3);
        
        answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}