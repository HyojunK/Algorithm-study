import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int result = 0;
		num = scan.nextInt();
		
		for(int a = 0; a < num; a++) {
			result++;
			System.out.println(result);
		}
	}
}