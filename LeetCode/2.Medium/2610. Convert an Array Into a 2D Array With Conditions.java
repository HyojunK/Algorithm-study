class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int[] count = new int[nums.length + 1];
        List<List<Integer>> answer = new ArrayList<>();
        
        for(int num : nums) {
            if(++count[num] > answer.size()){
                answer.add(new ArrayList<>());
            }
            
            answer.get(count[num] - 1).add(num);
        }
        
        return answer;
    }
}