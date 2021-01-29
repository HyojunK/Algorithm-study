class Solution {
    public String solution(String new_id) {
        String answer = "";
        
         //대문자 -> 소문자 치환
  		answer = new_id.toLowerCase()
  		//소문자, 숫자, 빼기, 밑줄, 마침표 제외 제거
  		.replaceAll("[^a-z0-9-_.]", "")
  		//마침표 2번 이상 -> 하나로 치환
  		.replaceAll("\\.{2,}", ".")
  		//마침표가 처음이나 끝에 위치하면 제거
  		.replaceAll("^\\.|\\.$", "");
  		//빈 문자열이라면 "a" 대입
  		if(answer.equals("")) answer = "a";
  		//길이가 16자 이상이면 16자 이상 제거, 제거후 마침표가 끝에 위치하면 마침표 제거
  		if(answer.length() >= 16) {
  			answer = answer.substring(0, 15).replaceAll("\\.$", "");
  		}
  		//길이가 2자 이하면 마지막문자를 길이가 3이 될 때까지 반복
        while(answer.length() < 3) {
            answer += answer.charAt(answer.length()-1);
        }
        
        return answer;
    }
}