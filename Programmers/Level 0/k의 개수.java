class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int x = i; x <= j; x++){
            answer += countK(x, k);
        }
        
        return answer;
    }
    
    public int countK(int num, int k){
        int result = 0;
        
        while(num > 0){
            if(num % 10 == k) result++;
            num /= 10;
        }
        
        return result;
    }
}