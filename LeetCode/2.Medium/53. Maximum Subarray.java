class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0]; // 가장 큰 부분 배열의 합

        for(int i = 1; i < nums.length; i++){
            /*
             * 현재 인덱스의 최대 부분합
             *
             * 이전 인덱스의 최대 부분합에서 현재 인덱스를 더한 값과 
             * 현재 인덱스의 값중 큰 값이 현재 인덱스의 최대 부분합
             */
            nums[i] = Math.max(nums[i - 1] + nums[i], nums[i]);
            maxSum = Math.max(maxSum, nums[i]); // 가장 큰 부분 배열의 합 갱신
        }

        return maxSum;
    }
}