import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		str = str.replace("dz=", "a");
		str = str.replace("lj", "a");
		str = str.replace("nj", "a");
		str = str.replace("=", "");
		str = str.replace("-", "");
		
		System.out.println(str.length());
	}//main end
}//class end