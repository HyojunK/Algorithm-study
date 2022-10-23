class Solution {
    public int solution(int n) {
        int answer = 2;
        
        if((int)Math.pow((int)Math.sqrt(n), 2) == n){
            answer = 1;
        }
        
        return answer;
    }
}