import java.util.Scanner;

public class Main {
	
	public static boolean[] prime = new boolean[10001];
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		isPrime();
		
		int t = scan.nextInt();
		
		for(int i = 0; i < t; i++) {
			int n = scan.nextInt();
			int a = n/2;
			int b = n/2;
			
			while(prime[a]||prime[b]) {
				a--;
				b++;
			}
			System.out.println(a + " " + b);
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