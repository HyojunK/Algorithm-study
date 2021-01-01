import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t,k,n;
		int[][] arr = new int[15][15];
		for(int i = 0; i < 15; i++) {
			arr[i][1] = 1;
			arr[0][i] = i;
		}
		
		for(int a = 1; a < 15; a++) {
			for(int b = 2; b < 15; b++) {
				arr[a][b] = arr[a][b-1] + arr[a-1][b];
			}
		}
		
		t = scan.nextInt();
		
		for(int i = 0; i < t; i++) {
			k = scan.nextInt();//층수
			n = scan.nextInt();//호수	
			
			System.out.println(arr[k][n]);
		}
		
		

	}//main end

}//class end