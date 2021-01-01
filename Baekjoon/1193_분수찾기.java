import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		int left = 1, right = 1;
		int line = 1;
		int range = 1;
		
		while(true) {
			if(range >= x) {
				break;
			}
			line++;
			range += line;
		}
		
		if(line%2 != 0) {
			right = line;
			for(int i = 0; i < range - x; i++) {
				left++;
				right--;
			}
		}
		else {
			left = line;
			for(int i = 0; i < range - x; i++) {
				left--;
				right++;
			}
		}
		
		
		System.out.println(left + "/" + right);
	}//main end
}//class end