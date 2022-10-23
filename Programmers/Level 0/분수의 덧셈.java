class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];
        
        int denum = denum1 * num2 + denum2 * num1;
        int num = num1 * num2;
        
        int g = gcd(denum, num); // 최대공약수
        answer[0] = denum / g;
        answer[1] = num / g;
        
        return answer;
    }
    
    // 유클리드 호제
    public int gcd(int a, int b){
        int r = a % b;
        if(r == 0) return b;
        return gcd(b, r);
    }
}