class Solution {
    public int findMin(int[] nums) {
        int answer = nums[0];
        /*
         * 배열의 첫번째 값이 마지막 값보다 작다면
         * 오름차순으로 배열되어 있는 상태
         * -> 첫번째 값을 return
         */
        if(nums[0] < nums[nums.length - 1]) return answer;

        for(int i = 1; i < nums.length; i++){
            /*
             * 오름차순으로 배열된 배열을 이동시켰으므로
             * 현재 탐색값이 이전 탐색값보다 작아지는 경우
             * 현재 탐색값이 정렬된 배열의 시작값이 된다
             */
            if(nums[i] < nums[i - 1]) {
                answer = nums[i];
                break;
            }
        }

        return answer;
    }
}