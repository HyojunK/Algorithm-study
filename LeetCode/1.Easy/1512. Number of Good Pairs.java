class Solution {
    public int numIdenticalPairs(int[] nums) {
        int answer = 0;
        int[] cnt = new int[101];

        for(int num : nums) {
            cnt[num]++;
        }

        for(int i = 1; i < cnt.length; i++) {
            answer += cnt[i] * (cnt[i] - 1) / 2;
        }

        return answer;
    }
}