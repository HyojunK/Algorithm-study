import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[10];
		int c = 10;

		for(int i = 0; i < 10; i++) {
			int x = scan.nextInt()%42;
			for(int j = 0; j < i; j++) {
				if(x == a[j]) {
					c--;
					break;
				}
			}
			a[i] = x;
		}

		System.out.println(c);

	}//main end
}//class end