class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int w = (brown + yellow) / 3; //가로 최대 길이 = 전체 격자 개수 / 3
		int h = 3; //세로 최소 길이 = 3
		
		while(w >= h) {
			if(2*(w + h) == (brown + 4) && w*h == brown + yellow) {
				answer[0] = w;
				answer[1] = h;
				break;
			}
			h++;
			w = (brown + yellow) / h;
		}
        
        return answer;
    }
}