class Solution {
    public int solution(int n) {
        int answer = 1;
        int factorial = 1;
        
        while(factorial <= n){
            if((answer + 1) * factorial > n) break;
            answer++;
            factorial *= answer;
        }
        
        return answer;
    }
}