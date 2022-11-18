class Solution {
    public boolean isUgly(int n) {
        if(n < 1) return false;
        
        boolean answer = true;
        /*
         * 2, 3, 5로 나누어 떨어지지 않을 때까지 차례대로 n을 나눔
         *
         */
        while(n % 2 == 0){ n /= 2; };
        while(n % 3 == 0){ n /= 3; };
        while(n % 5 == 0){ n /= 5; };

        // 모두 나누고 남은 수가 1이 아니라면 다른 약수가 존재
        if(n != 1) answer = false;

        return answer;
    }
}