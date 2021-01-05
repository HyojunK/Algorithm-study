import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int min = 0;
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		int w = scan.nextInt();
		int h = scan.nextInt();
		
		if(x-y > 0) min = y;
		else min = x;
		
		if(w - x < min) min = w - x;
		if(h - y < min) min = h - y;
		
		System.out.println(min);
	}
}//class end