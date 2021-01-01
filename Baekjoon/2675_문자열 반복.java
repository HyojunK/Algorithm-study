import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for(int i = 0; i < T; i++) {
			int R = scan.nextInt();
			
			String S = scan.next();
			String[] sArr = S.split("");
			for(String s : sArr) {
				for(int j = 0; j < R; j++){
					System.out.print(s);
				}
			}
			System.out.println();
		}
	}//main end
}//class end