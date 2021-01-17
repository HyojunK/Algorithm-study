import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int num = 666;
		int cnt = 1;
		
		while(n != cnt) {
			num++;
			
			if(String.valueOf(num).contains("666")) {
				cnt++;
			}
		}
		System.out.println(num);
	}
	
}//class end