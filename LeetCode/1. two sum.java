class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            int pair = target - nums[i]; // 현재 탐색 값에 대한 페어값 ( target - 현재값 )
            
            if(map.containsKey(pair)) { // 페어 값이 map에 존재하는 경우
                answer[0] = map.get(pair); // 페어 값에 대한 인덱스와 현재 탐색중인 인덱스를 정답 배열에 추가
                answer[1] = i;
                break;
            } else { // 페어값이 없는 경우
                map.put(nums[i], i); // 현재 탐색 값과 인덱스를 map에 저장
            }
        }
        
        return answer;
    }
}