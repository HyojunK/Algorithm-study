class Solution {
    public int getSum(int a, int b) {
        /*
         * 두 수 중 한쪽의 값이 0이 된다면 
         * 0이 아닌 쪽의 값을 return
         */
        if(a == 0) return b;
        if(b == 0) return a;

        int sum = a ^ b;         // 올림수 제외하고 더한 결과
        int carry =(a & b) << 1; // 올림수

        // getSum 함수를 재귀 호출
        return getSum(sum, carry);
    }
}