class Solution {
    public int search(int[] nums, int target) {
        int answer = -1;
        
        int start = 0;                  // 탐색 배열의 시작 인덱스
        int end = nums.length - 1;      // 탐색 배열의 종료 인덱스
        int pivot;                      // 이분 탐색의 기준 인덱스
        
        // 종료 인덱스가 시작 인덱스보다 작아질 때 까지 반복
        while(end >= start) {
            pivot = (start + end) / 2;    // pivot값을 탐색 배열의 가운데로 설정
            
            // pivot에 해당하는 값이 target과 같다면 pivot을 return
            if(nums[pivot] == target) return pivot;
            
            /*
             * 피벗을 기준으로 반으로 나누면 반드시 한 쪽 부분배열은 오름차순이 됨
             * 부분배열의 종료 인덱스 값이 시작 인덱스 값보다 크다면 오름차순
             * 왼쪽 부분배열을 기준으로 조건 확인
             */
            if(nums[start] <= nums[pivot]) {  // 왼쪽 부분배열이 오름차순인 경우
                if(nums[start] <= target && target <= nums[pivot]){     // target 값이 범위안에 들어가는 경우
                    end = pivot;    // 왼쪽 부분배열로 탐색 범위를 줄임
                } else {
                    start = pivot + 1;  // 오른쪽 부분배열로 탐색 범위를 줄임
                }
            } else {                    // 오른쪽 부분배열이 오름차순인 경우
                if(nums[pivot + 1] <= target && target <= nums[end]){   // target 값이 범위안에 들어가는 경우
                    start = pivot + 1;  // 오른쪽 부분배열로 탐색범위를 줄임
                } else {
                    end = pivot;    // 왼쪽 부분배열로 탐색 범위를 줄임
                }
            }
        }

        return answer;
    }
}