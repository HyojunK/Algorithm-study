class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        int[][] answer = new int[n/3][3];
        // nums 배열 오름차순 정렬
        Arrays.sort(nums);

        for(int i = 0; i < n; i += 3) {
            // 세 자리의 배열로 잘라서 복사
            int[] sub = Arrays.copyOfRange(nums, i, i + 3);
            // 복사한 배열의 가장 큰 요소와 가장 작은 요소의 차이가 k보다 크다면
            // 부분배열로 나누는 것이 불가능
            if(sub[2] - sub[0] > k) {
                return new int[][] {};
            }
            // 차이가 k보다 작다면 해당 배열을 정답 배열에 추가
            else {
                answer[i / 3] = sub;
            }
        }

        return answer;
    }
}