class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        String[] day = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        
        //1월 1일부터 선택한 날까지의 날짜 저장 변수
		int date = 0;
		
		//선택한 월의 전월까지의 날짜
		for(int i = 1; i < a; i++) {
			if(i == 2) {
				date += 29;
			}
			else if(i == 4 || i == 6 || i == 9 || i == 11) {
				date += 30;
			}
			else date += 31;
		}
		
		//선택한 일까지의 날짜
		date += b;
        
        //요일 구하기
		answer = day[(date%7)];
        
        return answer;
    }
}