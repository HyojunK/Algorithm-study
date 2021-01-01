import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = 0;
		int X = 0;
		int a = 0;
		
		N = scan.nextInt();
		X = scan.nextInt();
		
		for(int i =0; i<N; i++) {
			a = scan.nextInt();
			if(a < X) 
				System.out.printf("%d ", a);
				
		}
		
	}//main end

}//class end