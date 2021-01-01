import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		num = scan.nextInt();
		
		for(int a = 0; a < num; a++) {
			System.out.println(num - a);
		}	
	}
}