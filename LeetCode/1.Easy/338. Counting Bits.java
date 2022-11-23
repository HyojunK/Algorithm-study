class Solution {
    public int[] countBits(int n) {
        int[] answer = new int[n + 1];

        /*
         * 오른쪽 shift( >> ) 는 2로 나눈 값과 같음
         * 따라서 n에서 1 비트의 개수는 n의 마지막 비트와
         * n을 2로 나눈 수( 오른쪽으로 shift한 값 )의 비트의 합과 같음
         */
        for(int i = 1; i <= n; i++){
            answer[i] = (i & 1) + answer[i/2];
        }

        return answer;
    }
}