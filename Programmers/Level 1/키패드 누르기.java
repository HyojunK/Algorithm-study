class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
		
		//키패드 1번은 1,1부터 시작
		int x_left = 1;
		int y_left = 4;//왼손 처음 위치;
		int x_right = 3;
		int y_right = 4;//오른손 처음 위치;
		
		int x = 0;
		int y = 0;
		for(int i = 0; i < numbers.length; i++) {
			//누를 키패드의 좌표
			if(numbers[i] == 0) {
				x = 2;
				y = 4;
			}
			else {
				x = ((numbers[i] - 1) % 3) + 1;
				y = (numbers[i] + 2) / 3;
			}
			
			//거리 비교
			int move_l = (Math.abs(x_left - x) + Math.abs(y_left - y));//왼손이 이동할 거리
			int move_r = (Math.abs(x_right - x) + Math.abs(y_right - y));//왼손이 이동할 거리
			
			//1, 4, 7을 누를 때
			if(x == 1) {
				x_left = x;
				y_left = y;
				sb.append("L");
			}
			//3, 6, 9를 누를 때
			else if(x == 3) {
				x_right = x;
				y_right = y;
				sb.append("R");
			}
			//왼손이 가까울 때
			else if(move_l < move_r) {
				x_left = x;
				y_left = y;
				sb.append("L");
			}
			//오른손이 가까울 때
			else if(move_l > move_r) {
				x_right = x;
				y_right = y;
				sb.append("R");
			}
			//양손 거리가 같을 때
			else if(move_l == move_r) {
				if(hand.equals("right")) {
					x_right = x;
					y_right = y;
					sb.append("R");
				}
				else{
					x_left = x;
					y_left = y;
					sb.append("L");
				}
			}
		}
        return sb.toString();
    }
}