class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] nums = new int[1000];
        int maxFreq = -1;
        
        for(int i : array){
            nums[i]++;
        }
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > maxFreq){
                maxFreq = nums[i];
                answer = i;
            } else if(nums[i] == maxFreq){
                answer = -1;
            }
        }
        
        return answer;
    }
}