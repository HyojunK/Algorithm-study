import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		while(n != 1) {
			for(int i = 2; i <= n; i++) {
				if(n%i == 0) {
					n = n/i;
					System.out.println(i);
					break;
				}
			}
		}
	}

}//class end