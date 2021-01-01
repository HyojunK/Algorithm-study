import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[9];
		int max = 0;
		int location = 0;
		
		for(int i = 0; i < 9; i++) {
			arr[i] = scan.nextInt();
			if(arr[i] > max) {
				max = arr[i];
				location = i+1;		
			}
		}
		System.out.println(max);
		System.out.println(location);
		
		
	}//main end
}//class endnd