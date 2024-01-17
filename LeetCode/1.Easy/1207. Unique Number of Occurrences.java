class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> cntMap = new HashMap<>();

        for(int num : arr) {
            cntMap.put(num, cntMap.getOrDefault(num, 0) + 1);
        }

        Set<Integer> cntSet = new HashSet<>(cntMap.values());

        return cntMap.size() == cntSet.size();
    }
}