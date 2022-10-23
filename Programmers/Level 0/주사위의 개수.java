class Solution {
    public int solution(int[] box, int n) {
        int answer = box[0] / n;
        
        for(int i = 1; i < 3; i++){
            answer *= box[i] / n;
        }
        
        return answer;
    }
}