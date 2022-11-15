class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length]; // return할 결과값 배열
        
        int multiple = 1; // 초기값
        for(int i = 0; i < nums.length; i++) { // 왼쪽 수의 곱
            result[i] = multiple;   // result배열 i번째 값에 곱셈 결과를 넣고
            multiple *= nums[i];    // 곱셈 결과값을 증가시킴
        };
        
        multiple = 1;
        for(int i = nums.length - 1; i >= 0; i--) { // 오른쪽 수의 곱
            result[i] *= multiple;  // result배열 i번째 값에 현재 값과 곰셈 결과를 곱한 값을 넣고
            multiple *= nums[i];    // 곱셈 결과값을 증가시킴
        }
        
        return result; // 결과값을 반환
    }
}