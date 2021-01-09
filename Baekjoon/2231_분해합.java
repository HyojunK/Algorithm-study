import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int min = 0;
		
		for(int i = 1; i <= 1000000; i++) {
			int sum = i;
			int m = i;
			
			while(m > 0) {
				sum += m % 10;
				m /= 10;
			}
			
			if(sum == n) {
				min = i;
				break;
			}
		}
		System.out.println(min);
	}
}//class end