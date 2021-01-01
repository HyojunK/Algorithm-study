import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();
		
		for(int i = 97; i < 123; i++) {
			
			int loc = -1;
			
			for(int j = 0; j < S.length(); j++) {
				if(i == S.charAt(j)) {
					loc = j;
					break;
				}
			}
			System.out.print(loc + " ");
		}
	}//main end
}//class end
