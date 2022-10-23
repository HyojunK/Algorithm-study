class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        
        if(a != b){ // 정수가 아닌경우만
            int g = gcd(a, b); // 최대공약수
            b /= g; // 기약분수로 만든 분모
            
            while(b % 2 == 0){
                b /= 2;
            }
            while(b % 5 == 0){
                b /= 5;
            }
            if(b != 1) answer = 2;
        }
        
        return answer;
    }
    
    public int gcd(int a, int b){
        if(a % b == 0) return b;
        int r = a % b;
        return gcd(b, r);
    }
}