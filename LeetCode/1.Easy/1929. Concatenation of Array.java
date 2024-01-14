class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] answer = new int[length * 2];

        for(int i = 0; i < length * 2; i++) {
            answer[i] = nums[i % length];
        }

        return answer;
    }
}