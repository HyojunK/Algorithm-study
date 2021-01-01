import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int ra = (a%10)*100 + ((a%100)/10)*10 + a/100;
		int rb = (b%10)*100 + ((b%100)/10)*10 + b/100;
		
		System.out.println(ra > rb ? ra : rb);
	}//main end
}//class end