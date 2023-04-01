class Solution {
    public int search(int[] nums, int target) {
        // 탐색의 시작지점
        int start = 0;
        // 탐색의 종료지점
        int end = nums.length - 1;
        // 시작지점과 종료지점의 중간지점
        int mid;

        // 시작지점과 종료지점이 교차할 때까지 반복
        while(start <= end){
            // 중간지점을 구함
            mid = (start + end) / 2;

            // 중간지점의 값이 target과 일치하는 경우 인덱스를 중간값을 return
            if(nums[mid] == target) return mid;
            // 중간지점의 값이 target보다 큰 경우 종료지점을 중간값 하나 이전으로 설정
            else if(nums[mid] > target) {
                end = mid - 1;
            }
            // 중간지점의 값이 target보다 작은 경우 시작지점을 중간값 하나 뒤로 설정
            else {
                start = mid + 1;
            }

        }

        // 탐색이 종료된 후 target을 찾지 못한 경우 -1을 return
        return -1;
    }
}