class Solution {
    public boolean canJump(int[] nums) {
        int maxIndex = 0; // 최대 도착 가능한 인덱스

        // 최대 도착 가능한 인덱스가 nums의 길이 이상이 될 때까지 반복
        for(int i = 0; maxIndex < nums.length - 1; i++){
            // 현재 인덱스에서 이동가능 거리가 0이고
            // 최대 도착 가능한 인덱스가 현재 인덱스 이하이면
            // 끝까지 도달하는 것이 불가능하므로 false를 반환
            if(nums[i] == 0 && maxIndex <= i) return false;

            // maxDistance와 현재 인덱스에서 도달 가능한 위치 중
            // 최대값으로 maxDistance를 갱신
            maxIndex = Math.max(maxIndex, i + nums[i]);
        }
        // 탐색이 종료되면 최대 최대 이동 가능 거리가 nums 길이 이상이므로 true를 반환
        return true;
    }
}