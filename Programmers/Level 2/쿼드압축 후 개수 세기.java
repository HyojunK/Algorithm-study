class Solution {
    
    static int zero = 0; //0개수 카운트
	static int one = 0; //1개수 카운트
    static int[] answer = new int[2];
    
    public int[] solution(int[][] arr) {
        
        comp(arr, 0, 0, arr.length);
        
        return answer;
    }
    
    // 데이터를 추출할 배열, 시작점 x 좌표, 시작점 y 좌표, 한 변의 길이
	private static void comp(int[][] arr, int x, int y, int length) {
		int s = arr[x][y]; //시작점의 값
		
		if(length == 1) { //더이상 쪼갤 수 없을 때
			if(s == 0) answer[0]++;
			else answer[1]++;
			
			return;
		}
		
		boolean b = true; //압축 가능 여부
		check:
		for(int i = x; i < x + length; i++) {
			for(int j = y; j < y + length; j++){
				if(arr[i][j] != s) {
					b = false;
					break check;
				}
			}
		}
		
		if(b) { //압축이 가능 할 경우
			if(s == 0) answer[0]++;
			else answer[1]++;
		}
		else { //압축이 불가능 할 경우
			for(int i = x; i < x + length; i += length / 2) {
				for(int j = y; j < y + length; j += length / 2) {
					comp(arr, i, j, length / 2);
				}
			}
		}
	}
}