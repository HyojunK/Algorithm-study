import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		scan.nextLine();

		int[] score = new int[num];
		char[] result = new char[80];

		for(int i = 0; i < num; i++) {
			int o = 0;
			int sum = 0;
			
			String str = scan.nextLine();
			for(int j = 0; j < str.length(); j++) {
				result[j] = str.charAt(j);
				if(result[j] == 'O') {
					o += 1;
					sum += o;
				}
				else if(result[j] == 'X') {
					o = 0;
				}
			}
			score[i] = sum;
		}
		
		for(int a : score) {
			System.out.println(a);
		}
	}//main end
}//class end