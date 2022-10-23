import java.util.*;

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        Map<String, Boolean> used = new HashMap<>();
        
        String[] arr = my_string.split("");
        for(String s : arr) {
            if(!used.containsKey(s)) {
                sb.append(s);
                used.put(s, true);
            }
        }
        
        return sb.toString();
    }
}