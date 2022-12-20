class Solution {
    public int lengthOfLIS(int[] nums) {
        // 탐색결과를 저장할 배열 선언
        // dp 배열은 항상 정렬된 상태로 유지되며
        // dp배열의 원소의 길이가 최장 부분 증가 수열의 길이가 된다
        int[] dp = new int[nums.length];
        // 첫 번째 원소값 초기화
        dp[0] = nums[0];

        // 부분 증가 수열의 최장 길이
        int maxLength = 1;

        // nums 배열을 순회하며 탐색
        for(int i = 1; i < nums.length; i++){
            // 현재 탐색값이 dp 배열의 마지막 값보다 크다면
            // 현재 탐색값을 다음원소에 추가하고 최장 길이 증가
            if(nums[i] > dp[maxLength - 1]){
                dp[maxLength] = nums[i];
                maxLength++;
            } 
            // 현재 탐색값이 dp 배열의 마지막 값보다 크지 않다면
            // lowerBound를 이용해 현재 탐색값이 들어갈 수 있는 최적 위치에 갱신한다
            else {
                lowerBound(dp, nums[i], 0, maxLength - 1);
            }
        }

        return maxLength;
    }

    // 오름차순으로 정렬된 배열에서
    // n이 들어갈 수 있는 위치를 찾아 값을 갱신
    public void lowerBound(int[] arr, int n, int start, int end){
        // 시작인덱스와 종료인덱스의 가운데 인덱스
        int mid;

        // 시작인덱스와 종료인덱스가 만날 때까지 반복
        while(start < end){
            // 가운데 인덱스 설정
            mid = (start + end) / 2;
            // 중앙값이 n보다 작다면 시작 인덱스를 mid + 1로 설정
            if(arr[mid] < n) start = mid + 1;
            // 중앙값이 n이상이라면 종료 인덱스를 mid로 설정
            else end = mid;
        }

        // 탐색이 종료되면 lowerBound 위치의 값을 n으로 갱신
        arr[end] = n;
    }
}