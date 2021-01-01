import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int min = 1000000;
		int max = -1000000;
		
		int a = scan.nextInt();
		int[] arr = new int[a];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
		
		
	}//main end
}//class end