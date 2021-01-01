import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		int num = scan.nextInt();
		
		while(num%5 != 0) {
			num -= 3;
			count++;
			if(num == 0) {
				System.out.println(count);
				break;
			}
			else if(num < 3) {
				System.out.println(-1);
				return;
			}
		}
		while(num != 0) {
			num -= 5;
			count++;
			if(num == 0) {
				System.out.println(count);
			}
		}
	}//main end
}//class end