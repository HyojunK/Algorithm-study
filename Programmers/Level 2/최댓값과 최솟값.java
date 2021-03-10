import java.util.*;

class Solution {
    public String solution(String s) {
        List<Integer> list = new ArrayList<>();
		
		StringTokenizer st = new StringTokenizer(s);
		while(st.hasMoreTokens()) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(list);
		
		StringBuilder sb = new StringBuilder();
		sb.append(list.get(0)).append(" ").append(list.get(list.size() - 1));
        
        return sb.toString();
    }
}