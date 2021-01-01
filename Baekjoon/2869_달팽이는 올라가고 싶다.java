import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long a = scan.nextInt();
		long b = scan.nextInt();
		long v = scan.nextInt();
		long result = (v-b)/(a-b);
		
		if((v-b)%(a-b) != 0) {
			result++;
		}
		System.out.println(result);
		
	}

}