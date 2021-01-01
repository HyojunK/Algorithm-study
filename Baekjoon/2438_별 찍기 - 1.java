import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		num = scan.nextInt();
		
		for(int a = 0; a < num; a++) {
			for(int b = 0; b <= a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		 
		
	}//main end

}//class end