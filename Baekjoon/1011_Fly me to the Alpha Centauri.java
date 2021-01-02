import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		int cnt = 0;
		
		for(int i = 0; i < T; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			int distance = y - x;
			double isSqrt = Math.sqrt(distance);//제곱근 판단용
			int range = (int)Math.sqrt(distance);//거리의 제곱근 범위 시작
			
			if(isSqrt == range) {
				//거리가 어떤 수의 제곱이면
				//횟수는 거리의 (제곱근*2)-1
				cnt = (range*2)-1;
			}
			else if(distance <= Math.pow(range, 2) + range) {
				//range^2 와 range+1^2 사이에서
				//거리가 절반 이하에 속해있으면 (제곱근*2)
				cnt = (range*2);
			}
			else {
				//절반 이상에 속해있으면 (제곱근*2) + 1
				cnt = (range*2) + 1;
			}
			
			System.out.println(cnt);
			
		}
		
	}//main end
}//class end