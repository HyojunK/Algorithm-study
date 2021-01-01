import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long A = scan.nextInt(); //고정비용
		long B = scan.nextInt(); //가변비용
		long C = scan.nextInt(); //상품가격

		if(B >= C) {
			System.out.println(-1);
		}
		else {
			long result = (A/(C-B)) + 1;
			System.out.println(result);
		}
		
	}//main end
}//class end