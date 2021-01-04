import java.util.Scanner;

public class Main {
	
	public static boolean[] prime = new boolean[(2*123456) + 1];
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		isPrime();
		
		while(true) {
			int n = scan.nextInt();
			if(n == 0) break;
			
			int cnt = 0;
			for(int i = n + 1; i <= 2 * n; i++) {
				if(!prime[i]) cnt++;
			}
			System.out.println(cnt);
		}
	}
		
		
	public static void isPrime() {
		prime[0] = prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j = i + i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}

}//class end