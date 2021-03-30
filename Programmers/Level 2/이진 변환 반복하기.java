import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        int cnt = 0; //변환 횟수
		int zero = 0; //제거된 0 개수
		
		while(!s.equals("1")) {
			int length = s.length(); //원래 문자열의 길이
			s = s.replace("0", ""); //0 제거
			zero += length - s.length(); //원래 문자열 길이 - 0을 제거한 문자열 길이 = 제거한 0의 개수
			length = s.length();
			
			//이진수 변환
			List<Integer> list = new ArrayList<>();
			while(length > 1) {
				list.add(length % 2);
				length /= 2;
			}
			
			StringBuilder sb = new StringBuilder();
			sb.append("1");
			for(int i = list.size() - 1; i >= 0; i--) {
				sb.append(list.get(i));
			}
			
			s = sb.toString();
			cnt++;//횟수 증가
		}
        
        answer[0] = cnt;
        answer[1] = zero;
        
        return answer;
    }
}