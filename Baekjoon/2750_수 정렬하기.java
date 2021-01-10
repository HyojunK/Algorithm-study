import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] numbers = new int[n];
		
		for(int i = 0; i < n; i++) {
			numbers[i] = scan.nextInt();
		}
		
		for(int j = 0; j < numbers.length; j++) {
			for(int k = 0; k < numbers.length - (j+1); k++) {
				if(numbers[k] > numbers[k+1]) {
					swap(numbers, k, k+1);
				}
			}
		}
		
		for(int a : numbers) {
			System.out.println(a);
		}
	}

	private static void swap(int[] numbers, int a, int b) {
		int temp = numbers[a];
		numbers[a] = numbers[b];
		numbers[b] = temp;
	}
	
}//class end