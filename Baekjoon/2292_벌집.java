import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int room = scan.nextInt();
		int count = 1;
		int range = 1;

		while(true) {
			if(range >= room) {
				break;
			}
			range += 6*(count++);
		}

		System.out.println(count);

	}//main end
}//class end