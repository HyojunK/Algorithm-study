import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		System.out.println(getHansu(num));
	}

	private static int getHansu(int i) {
		int count = 0;
		
		
		if(i < 100) {
			return i;
		}
		else{
			for(int j = 100; j <= i; j++) {
				int a = (j/100);//백의자리
				int b = (j%100)/10;//십의자리
				int c = (j%10);//일의자리
				
				if(a-b == b-c) {
					count++;
				}
			}
		}
		return count+99;
	}
}//class end