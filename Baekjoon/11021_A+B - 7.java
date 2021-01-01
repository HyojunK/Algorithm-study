import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num,a,b,result = 0;
		num = scan.nextInt();
		
		for(int i = 1; i <= num; i++) {
			a = scan.nextInt();
			b = scan.nextInt();
			result = a+b;
			System.out.printf("Case #%d: %d\n", i, result);
		}	
	}
}