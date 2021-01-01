import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		scan.nextLine();
		int sum = 0;
		
		String str = scan.nextLine();
		
		for(int i = 0; i < size; i++) {
			char c = str.charAt(i);
			int num = c - '0';
			sum += num;
		}
		System.out.println(sum);
		
	}//main end
}//class end