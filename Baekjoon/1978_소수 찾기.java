import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int result = 0;
		int c = 0;
		
		int n = scan.nextInt();
		for(int i = 0; i < n; i++) {
			int a = scan.nextInt();
			if(a == 1) {
				continue;
			}
			for(int j = 2; j < a; j++) {
				
				if(a%j == 0) {
					c++;
					break;
				}
			}
			if(c == 0) {
				result++;
			}
			else {
				c--;
			}
			
		}//for end
		System.out.println(result);
	}//main end

}//class end