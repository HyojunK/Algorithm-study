import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;

        List<Integer> list = new ArrayList<Integer>();
        if(n < 3) {
            answer = n;
        }
        else {
            while(n >= 3) {
                list.add(n%3);
                n = n/3;
                if(n < 3) {
                    list.add(n);
                }
            }
            int size = list.size();
            for(int i = 0; i < list.size(); i++) {
                answer += list.get(i)*Math.pow(3, (list.size() - 1 - i));
            }
        }

        return answer;
    }
}