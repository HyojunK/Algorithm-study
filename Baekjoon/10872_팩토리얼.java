import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		System.out.println(self(n));
		
	}//main end
	
	public static int self(int i) {
		if(i <= 1) {
			return 1;
		}
		else {
			return self(i-1)*i;
		}
	}//self end

}//class end