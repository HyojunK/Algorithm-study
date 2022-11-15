class Solution {
    public int maxProduct(int[] nums) {
        int[] minArr = new int[nums.length]; // 부분배열의 곱 최소값 배열
        int[] maxArr = new int[nums.length]; // 부분배열의 곱 최대값 배열
        int maxProd; // 부분배열의 곱 최대값
        
        minArr[0] = maxArr[0] = maxProd = nums[0]; // 첫 번째 인덱스 값으로 각각 초기화
        
        for(int i = 1; i < nums.length; i++) {
            /*
             * i번째 인덱스에서 부분배열의 곱 최소값
             * 
             * 1. 현재 인덱스값
             * 2. 이전 인덱스 최소값 * 현재 인덱스 값
             * 3. 이전 인덱스 최대값 * 현재 인덱스 값
             * 
             * 3가지 중 최소값
             * 
             */
            minArr[i] = Math.min(nums[i], Math.min(minArr[i - 1] * nums[i], maxArr[i - 1] * nums[i]));
            
            /*
             * i번째 인덱스에서 부분배열의 곱 최대값
             * 
             * 1. 현재 인덱스값
             * 2. 이전 인덱스 최소값 * 현재 인덱스 값
             * 3. 이전 인덱스 최대값 * 현재 인덱스 값
             * 
             * 3가지 중 최대값
             * 
             */
            maxArr[i] = Math.max(nums[i], Math.max(minArr[i - 1] * nums[i], maxArr[i - 1] * nums[i]));
            
            maxProd = Math.max(maxProd, maxArr[i]); // 부분배열의 곱 최대값 갱신
        }

        return maxProd;
    }
}