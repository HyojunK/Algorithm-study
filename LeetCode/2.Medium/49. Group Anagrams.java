class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // 최종 결과 리스트
        List<List<String>> result = new ArrayList<>();
        
        // 각 anagram 그룹별 문자열을 저장할 map
        Map<String, List<String>> map = new HashMap<>();
        // 문자열 하나씩 탐색
        for(String word : strs) {
            // 문자열에서 사용된 알파벳 개수를 저장할 정수 배열
            int[] alphabet = new int[26];
            // 현재 탐색문자의 각 알파벳 탐색
            for(char c : word.toCharArray()) {
                // 해당하는 알파벳의 값을 증가
                alphabet[c - 'a']++;
            }
            // 알파벳 map을 문자열로 변환하여 그룹키로 사용
            String groupKey = Arrays.toString(alphabet);
            
            // map에 그룹키가 존재하지 않는다면 키를 추가
            if(!map.containsKey(groupKey)) {
                map.put(groupKey, new ArrayList<>());
            }
            
            // 해당 그룹키에 현재 문자열 추가
            map.get(groupKey).add(word);
        }
        
        // map의 값들을 정답 리스트에 추가
        for(String key : map.keySet()) {
            result.add(map.get(key));
        }

        // 결과 리스트 return
        return result;
    }
}