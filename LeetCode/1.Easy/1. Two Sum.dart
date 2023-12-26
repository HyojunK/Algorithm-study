class Solution {
  List<int> twoSum(List<int> nums, int target) {
        Map<int, int> pairMap = {};

        for (int i = 0; i < nums.length; i++) {
            int pair = target - nums[i];

            if (pairMap.containsKey(pair)) {
                return [pairMap[pair]!, i];
            }
            pairMap[nums[i]] = i;
        }

        return [];
    }
}