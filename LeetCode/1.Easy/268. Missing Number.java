class Solution {
    public int missingNumber(int[] nums) {
        int result = 0;

        /*
         * 0부터 nums의 길이 - 1 까지의 수를 XOR 연산하고
         * nums 배열의 각 값들을 XOR 연산한다
         */
        for(int i = 0; i < nums.length; i++){
            result ^= nums[i];
            result ^= i;
        }

        /*
         * n - 1 까지만 XOR 연산 했으므로 
         * 마지막 n까지 XOR 연산
         */
         result ^= nums.length;

        /*
         * 연산 중 한 번만 등장한 수는 초기값인 0으로 돌아가지 않고 남게됨
         */
        return result;
    }
}