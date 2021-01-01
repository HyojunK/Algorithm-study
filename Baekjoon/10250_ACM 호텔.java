import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t,h,w,n,y,x;
		int room = 0;
		
		t = scan.nextInt();
		scan.nextLine();
		
		for(int i = 0; i < t; i++) {
			String str = scan.nextLine();
			String [] strArr = str.split(" ");
			h = Integer.parseInt(strArr[0]);
			w = Integer.parseInt(strArr[1]);
			n = Integer.parseInt(strArr[2]);
			
			if(n%h == 0) {
				y = h*100;
				x = n/h;
			}
			else {
				y = (n%h)*100;
				x = (n/h) + 1;
			}
			
			room = y + x;
			System.out.println(room);
		}

	}

}