class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            // 두 문자열의 크기가 다른경우 false를 return
            return false;
        }

        // 각 문자열을 char 배열로 변환
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        
        // 배열의 각 문자를 key로 하는 map을 만들고
        // s 배열의 값은 더하고 t 배열의 값은 빼준다
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < sChar.length; i++) {
            map.put(sChar[i], map.getOrDefault(sChar[i], 0) + 1);
            map.put(tChar[i], map.getOrDefault(tChar[i], 0) - 1);
        }

        // map에서 0이 아닌 값이 있으면 anagram이 될 수 없으므로 false를 return
        for(char key : map.keySet()) {
            if(map.get(key) != 0) {
                return false;
            }
        }

        return true;
    }
}
