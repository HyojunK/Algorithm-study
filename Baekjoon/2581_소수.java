import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int min = 10000;
		int m,n;
		
		m = scan.nextInt();
		n = scan.nextInt();
		
		for(int i = m; i <= n; i++) {
			if(isPrime(i)) {
				sum += i;
				if(i < min) {
					min = i;
				}
			}
		}
		if(sum != 0) {
			System.out.println(sum);
		}
		if(min == 10000) {
			System.out.println(-1);
		}
		else {
			System.out.println(min);
		}
		
	}//main end
	
	public static boolean isPrime(int a) {
		boolean result = false;
		int count = 0;
		
		if(a == 1) {
			return result;
		}
		
		for(int i = 2; i < a; i++) {
			if(a%i == 0) {
				count++;
				break;
			}
		}
		if(count == 0) {
			result = true;
		}
		
		return result;
	}

}//class end
