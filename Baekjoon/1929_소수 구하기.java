import java.util.Scanner;

public class Main {
	public static boolean primeList[];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int m = scan.nextInt();
		int n = scan.nextInt();
		
		primeList = new boolean[n+1];
		
		isPrime();
		
		for(int i = m; i <= n; i++) {
			if(!primeList[i]) {
				System.out.println(i);
			}
		}
	}
	
	//에라토스테네스의 체
	public static void isPrime() {
		primeList[0] = primeList[1] = true;
		
		for(int i = 2; i <= Math.sqrt(primeList.length); i++) {
			if(primeList[i]) {
				continue;
			}
			for(int j = i+i; j < primeList.length; j+= i) {
				primeList[j] = true;
			}
		}
	}
}//class end