import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		
		int[] countArr = new int[10];
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int result = a*b*c;
		
		String str = String.valueOf(result);
		int[] arr = new int[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			char chNum = str.charAt(i);
			int num = chNum - '0';
			arr[i] = num;
		}
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < str.length(); j++) {
				if(arr[j] == i) {
					countArr[i]++;
				}
			}
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(countArr[i]);
		}
		
	}//main end
}//class end