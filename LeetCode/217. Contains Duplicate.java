class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Boolean> dataMap = new HashMap<>(); // 탐색한 데이터를 저장할 Map
		for(int i : nums) {
			if(dataMap.containsKey(i)) { // 이미 탐색한 값인 경우 (중복이 존재)
				return true;
			} else { // 처음 탐색한 값인 경우
				dataMap.put(i, true); // 현재 값을 탐색한 데이터 Map에 저장				
			}
		}
		
		return false; // 배열을 모두 탐색 후 중복 값이 없으면 false를 return
    }
}