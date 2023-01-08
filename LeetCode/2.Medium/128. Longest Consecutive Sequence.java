class Solution {
    public int longestConsecutive(int[] nums) {
        // 탐색에 사용할 set
        Set<Integer> set = new HashSet<>();
        // nums 배열의 모든 값을 set에 저장
        for(int i : nums) set.add(i);
        // Longest Consecutive Sequence
        int lcs = 0;
        // nums 배열의 모든 값에 대해 탐색
        for(int i : nums) {
            // 연속하는 수의 길이
            int length = 1;
            // Set에서 현재 탐색중인 값 제거
            set.remove(i);
            // 연속하는 감소하는 수
            int left = i - 1;
            // 연속하는 증가하는 수
            int right = i + 1;

            // 연속하는 감소하는 수 탐색
            while(set.contains(left)) {
                // 길이 증가
                length++;
                // 탐색하는 수 감소
                left--;
            }
            
            // 연속하는 증가하는 수 탐색
            while(set.contains(right)) {
                // 길이 증가
                length++;
                // 탐색하는 수 감소
                right++;
            }
            // 최대값 갱신
            lcs = Math.max(lcs, length);
        }

        return lcs;
    }
}