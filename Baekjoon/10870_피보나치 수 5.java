import java.util.Scanner;

public class Main {
	static int a = 0;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		System.out.println(fibonacci(n));
	}//main end

	private static int fibonacci(int n) {
		if(n == 0) {
			return 0;
		}
		else if(n == 1) {
			return 1;
		}
		else {
			return fibonacci(n-2) + fibonacci(n-1);
		}
	}

}//class end