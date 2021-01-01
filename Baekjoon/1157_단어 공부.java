import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] abc = new int[26];
		int count = 0;
		int max = 0;
		char result = ' ';
		String str = scan.nextLine();
		
		for(int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);
			if(a < 91) {
				count = a - 65;
				abc[count]++;
			}
			else {
				count = a - 97;
				abc[count]++;
			}
			
			if(abc[count] == max) {
				result = '?';
			}
			if(abc[count] > max) {
				max = abc[count];
				result = (char)(count + 65);
			}
		}
		System.out.println(result);
	}//main end
}//class end