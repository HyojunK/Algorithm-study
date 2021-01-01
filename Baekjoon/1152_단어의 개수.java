import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int d = 0;
		
		String str = scan.nextLine();
		
		String[] strArr= str.split(" ");
		
		if(strArr.length > 0) {
			if(strArr[0].equals("")) {
				System.out.println(strArr.length - 1);
			}
			else {
				System.out.println(strArr.length);
			}
		}
		else {
			System.out.println(0);
		}
	}//main end
}//class end